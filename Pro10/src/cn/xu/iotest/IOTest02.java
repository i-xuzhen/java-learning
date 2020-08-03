package cn.xu.iotest;

import java.io.*;

/**
 * 1.先创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * 第一个程序：测试流程
 */
public class IOTest02 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("D:/eclipse-workspace/Pro10/src/abc.txt");
        //2.选择流
        InputStream is=null;
        try {
            is=new FileInputStream(src);
            //3.操作（读取）
            int temp;
            while((temp=is.read())!=-1){
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
