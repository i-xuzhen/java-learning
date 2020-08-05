package cn.xu.Decorate;

import java.io.*;

/**
 * 测试：文件字符输入流  加入缓冲流
 * 1.先创建源
 * 2.选择文件字符输入流
 * 3.操作
 * 4.释放资源
 *
 */
public class BufferedTest03 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("D:/eclipse-workspace/Pro10/src/abc.txt");
        //2.选择流
        BufferedReader reader=null;//子类有了新方法就不要用多态
        try {
            reader=new BufferedReader(new FileReader(src));
            //3.操作（读取）
            String line=null;
            while((line=reader.readLine())!=null){//len每次返回读到的内容
                //字符数组-->>字符串（不再存在解码一说）
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
