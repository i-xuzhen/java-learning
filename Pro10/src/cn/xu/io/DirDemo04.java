package cn.xu.io;

import java.io.File;

/**
 * 打印子孙级目录和文件的名称
 */
public class DirDemo04 {
    public static void main(String[] args) {
       // System.out.println(System.getProperty("usr.dir"));
        File dir=new File("D:/eclipse-workspace/Pro10");

        //打印子孙级目录和文件的名称
        printName(dir,0);

    }

    public static void printName(File src,int deep){

        for(int i=0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(src==null||!src.exists()){
            return;
        }else if(src.isDirectory()){
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }
    }


}
