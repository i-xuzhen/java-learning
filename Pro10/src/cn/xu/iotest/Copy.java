package cn.xu.iotest;

import java.io.*;

/**
 * 使用文件字节输入流和输出流达到文件的拷贝
 1、创建源
 2.选择流
 3.操作（写出 内容）
 4.释放资源

 ？？？思考：利用递归，制作文件夹的拷贝
 */
public class Copy {
    public static void main(String[] args) {
        copy("D:\\eclipse-workspace\\Pro10\\src\\ball.png","cball.png");
    }

    public static void copy(String srcPath,String destPath){
        //1.创建源
        File src=new File(srcPath);
        File dest=new File(destPath);
        //2.选择流
        InputStream is=null;
        OutputStream os =null;
        try{
            //3.操作
            is=new FileInputStream(src);
            os=new FileOutputStream(dest,false);
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
            try {//4.释放资源  分别关闭，先打开的后关闭
                if(null!=os){
                    os.close();
                }
                if(null!=is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
