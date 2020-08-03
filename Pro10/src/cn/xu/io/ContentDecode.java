package cn.xu.io;

import java.io.UnsupportedEncodingException;

public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="性命生命使命a";
        //解码：
        byte[] datas=msg.getBytes();

        //解码：字符串String(byte[] bytes, int offset, int length, Charset charset)
        msg=new String(datas,0,datas.length,"utf8");
        System.out.println(msg);

        //乱码
        //1)字节数不够
        msg=new String(datas,0,datas.length-2,"utf8");
        System.out.println(msg);

        msg=new String(datas,0,datas.length-1,"utf8");
        System.out.println(msg);
        //2)字符集不统一
        msg=new String(datas,0,datas.length-1,"gbk");
        System.out.println(msg);
    }
}
