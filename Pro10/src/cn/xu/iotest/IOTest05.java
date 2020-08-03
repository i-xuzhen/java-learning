package cn.xu.iotest;

import java.io.*;

/**
 * 测试：文件字符输入流
 * 1.先创建源
 * 2.选择文件字符输入流
 * 3.操作
 * 4.释放资源
 *
 */
public class IOTest05 {
    public static void main(String[] args) {
        //1.创建源
        File src=new File("D:/eclipse-workspace/Pro10/src/abc.txt");
        //2.选择流
        Reader reader=null;
        try {
            reader=new FileReader(src);
            //3.操作（读取）
            char[] flush=new char[1024];//缓冲容器，分段读取
            int len=-1;//接收长度
            while((len=reader.read(flush))!=-1){//len每次返回读到的内容
                //字符数组-->>字符串（不再存在解码一说）
                String str =new String (flush,0,len);//从car这个字节流里面读数据，从第0个开始，读长度为len进行解码
                System.out.println(str);
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
