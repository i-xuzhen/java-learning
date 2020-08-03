package cn.xu.iotest;

import java.io.*;

/**
 * 字节数组输出流
 * 1.源头内部维护
 * 2.选择流不关联源
 * 3.操作一样
 * 4.不用释放资源
 *
 * 获取数据：toByteArray()
 * ByteArrayInputStream
 * ByteArratOutputStream
 */
public class ByteArrayTest02 {
    public static void main(String[] args) {
        //1.创建源
        byte[] dest=null;
        //2.选择流
        ByteArrayOutputStream baos=null;
        try{
            baos=new ByteArrayOutputStream();
            String msg="show me the code";
            byte[] datas=msg.getBytes();
            baos.write(datas,0,datas.length);
            baos.flush();
            //获取数据
            dest=baos.toByteArray();
            System.out.println(dest.length+"--->>"+new String(dest,0,dest.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
