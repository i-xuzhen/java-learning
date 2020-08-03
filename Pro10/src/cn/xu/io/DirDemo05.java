package cn.xu.io;

import java.io.File;

/**
 * 统计文件夹的大小
 */
public class DirDemo05 {
    public static void main(String[] args) {
        File dir=new File("D:/eclipse-workspace/Pro10");

        count(dir);
        System.out.println(len);
    }

    public static long len=0;
    public static void count(File src){

        if(null!=src && src.exists()){
            if(src.isFile()){//才有大小
                len+=src.length();
            }else{
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }


}
