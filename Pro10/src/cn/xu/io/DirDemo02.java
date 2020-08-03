package cn.xu.io;

import java.io.File;

/**
 * 列出下级
 * 1.list():列出下级名称
 * 2.listFiles():列出下级File对象
 *
 * 3.listRoots():列出所有盘符
 */
public class DirDemo02 {
    public static void main(String[] args) {
       // System.out.println(System.getProperty("usr.dir"));
        File dir=new File("D:/eclipse-workspace/Pro10");

        //下级名称 list
        String[] subNames=dir.list();
        for(String s:subNames){
            System.out.println(s);
        }

        System.out.println("##########");

        //下级对象 listFiles()
        File[] subFiles=dir.listFiles();
        for(File s:subFiles){
            System.out.println(s.getAbsolutePath());
        }

        System.out.println("##########");

        File[] roots=dir.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }


    }
}
