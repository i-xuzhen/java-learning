package cn.xu.iotest;

import java.io.*;

/**
 * try...with...resource
 * 自动释放资源
 */
public class FileUtils2 {
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
     * try...with...resource
     * @param is
     * @param os
     */
    public static void copy(InputStream is, OutputStream os){
            //try...with...resource
            try(is;os){
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
            }
    }

    /**
     * try...with...resource
     * @param srcPath
     * @param destPath
     */
    public static void copy2(String srcPath,String destPath){
        //1.创建源
        File src=new File(srcPath);
        File dest=new File(destPath);
        //try...with...resource
        try(InputStream is=new FileInputStream(src);
            OutputStream os=new FileOutputStream(dest,false);){
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
        }
    }


}
