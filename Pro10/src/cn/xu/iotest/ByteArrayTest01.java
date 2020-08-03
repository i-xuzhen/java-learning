package cn.xu.iotest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * 1.源头换成字节数组，不再是硬盘上的文件
 * 2.字节数字流不用关，由JAVA的gc自行释放
 * 3.任何东西都可以转成字节数组
 * 4.字节数组不要太大
 * ByteArrayInputStream
 * ByteArratOutputStream
 */
public class ByteArrayTest01 {
    public static void main(String[] args) {
        //1.创建源
        byte[] src="talk is cheap show me the code".getBytes();
        //2.选择流
        InputStream is=null;
        try{
            is=new ByteArrayInputStream(src);
            byte[] flush=new byte[5];
            int len=-1;
            while((len=is.read(flush))!=-1){
                String str=new String(flush,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
