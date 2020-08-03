package cn.xu.io;

import java.io.UnsupportedEncodingException;

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="性命生命使命";
        //编码:字节数
        byte[] data=msg.getBytes();
        System.out.println(data.length);

        //编码：其他字符集
        data=msg.getBytes("UTF-16LE");
        System.out.println(data.length);

        data=msg.getBytes("GBK");
        System.out.println(data.length);
    }
}
