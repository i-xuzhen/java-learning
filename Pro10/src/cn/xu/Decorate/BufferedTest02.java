package cn.xu.Decorate;

import java.io.*;

/**
 * 加入输出缓冲流
 */
public class BufferedTest02 {
    public static void main(String[] args) {
        File dest=new File("dest.txt");
        OutputStream os=null;
        try{//加输入缓冲流，8K
            os=new BufferedOutputStream(new FileOutputStream(dest));
            String msg="io is so easy\n";
            byte[] datas=msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
