package cn.xu.iotest;

import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * 1.封装拷贝
 * 2.封装释放资源
 */
public class FileUtils {
    public static void main(String[] args) {
        //测试文件到文件
        try {
            InputStream is = new FileInputStream("D:\\eclipse-workspace\\Pro10\\src\\abc.txt");
            OutputStream os =new FileOutputStream("abc-copy.txt");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //测试文件到字节数组
        byte[] datas=null;
        try{
            InputStream is=new FileInputStream("D:\\eclipse-workspace\\Pro10\\src\\ball.png");
            ByteArrayOutputStream os= new ByteArrayOutputStream();
            copy(is,os);
            datas=os.toByteArray();
            System.out.println(datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //测试从字节数组到文件
        try{
            InputStream is=new ByteArrayInputStream(datas);
            OutputStream os=new FileOutputStream("cball-2.png");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 对接输入输出流
     * @param is
     * @param os
     */
    public static void copy(InputStream is, OutputStream os){

            try{
                byte[] flush=new byte[1024];
                int len=-1;
                String str = null;
                while((len=is.read(flush))!=-1){
                    os.write(flush,0,len);//分段读取，实现拷贝
                }
                os.flush();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //4.释放资源 分别关闭，先打开后关闭
               close(is,os);
            }
    }
    /**
     * 释放资源
     * @param is
     * @param os
     */
//    public static void close(InputStream is, OutputStream os){
//        try {//4.释放资源  分别关闭，先打开的后关闭
//            if(null!=os){
//                os.close();
//            }
//            if(null!=is){
//                is.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 释放资源
     * @param ios
     */
    //关闭顺序由传参时决定，可变参数可以看作是一个参数数组
    public static void close(Closeable... ios){//...可变参数！！
        for(Closeable io:ios){
            try {//4.释放资源  分别关闭，先打开的后关闭
                if(null!=io){
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
