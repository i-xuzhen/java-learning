package cn.xu.iotest;

import java.io.*;

/**
 * 文件字符输出流
 1、创建源
 2.选择流
 3.操作（写出 内容）
 4.释放资源
 */
public class IOTest06 {
    public static void main(String[] args) {
        //1.创建源
        File dest=new File("dest.txt");
        //2.选择流
        Writer writer=null;
        try{
            //3.操作
            writer=new FileWriter(dest,false);
            //写法一：
//            String msg="IO is so easy\r\n你好呀！";
//            char[] datas=msg.toCharArray();//字符串-->>字符数组（编码）
//            writer.write(datas,0,datas.length);
            //写法二
//            String msg="IO is so easy\r\n徐圳要坚持住，继续加油！";
//            writer.write(msg);

            //写法三
            writer.append("IO is so easy\r\n").append("持续努力\r\n");

            writer.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//4.释放资源
                if(null!=writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
