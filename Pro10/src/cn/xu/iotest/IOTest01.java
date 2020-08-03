package cn.xu.iotest;

import java.io.*;

/**
 * 1.先创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * 第一个程序：测试流程
 */
public class IOTest01 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("D:/eclipse-workspace/Pro10/src/abc.txt");
        //2.选择流
        try {
            InputStream is=new FileInputStream(src);
            //3.操作（读取）
            int data1=is.read();//读取第一个数据
            int data2=is.read();//读取第二个数据
            int data3=is.read();//读取第三个数据
            int data4=is.read();//读取第三个数据//没读到数据返回-1
            System.out.println((char)data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            System.out.println(data4);
            //4.释放资源
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
