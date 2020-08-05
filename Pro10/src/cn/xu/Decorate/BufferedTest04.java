package cn.xu.Decorate;

import java.io.*;

/**
 * 文件字符输出流   加入缓冲流
 1、创建源
 2.选择流
 3.操作（写出 内容）
 4.释放资源
 */
public class BufferedTest04 {
    public static void main(String[] args) {
        //1.创建源
        File dest=new File("dest.txt");
        //2.选择流
        BufferedWriter writer=null;
        try{
            //3.操作
            writer=new BufferedWriter(new FileWriter(dest,false));

            writer.append("IO is so easy");
            writer.newLine();//换行
            writer.append("持续努力");
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
