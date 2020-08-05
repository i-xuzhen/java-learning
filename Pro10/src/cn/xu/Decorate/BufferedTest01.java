package cn.xu.Decorate;

import java.io.*;

/**
 * 加入输入缓冲流
 */
public class BufferedTest01 {
    public static void main(String[] args) {
        File src=new File("abc-copy.txt");
        InputStream is=null;
        try{//加输入缓冲流，8K
            is=new BufferedInputStream(new FileInputStream(src));
            byte[] flush=new byte[1024];
            int len=-1;
            while((len=is.read(flush))!=-1){
                String str=new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
