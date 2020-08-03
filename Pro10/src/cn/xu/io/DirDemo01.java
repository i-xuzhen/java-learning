package cn.xu.io;

import java.io.File;

/**
 * 创建目录
 * 1.mkdir:必须有上级目录，上级目录不存在则创建失败
 * 2.mkdirs：上级目录可以不存在，若不存在则一同创建
 */
public class DirDemo01 {
    public static void main(String[] args) {
       // System.out.println(System.getProperty("usr.dir"));
        File dir=new File("D:/eclipse-workspace/Pro10/dir/test");

        boolean flag=dir.mkdir();
        System.out.println(flag);

        flag=dir.mkdirs();
        System.out.println(flag);

        dir=new File("D:/eclipse-workspace/Pro10/dir/test02");
        flag=dir.mkdir();
        System.out.println(flag);


    }
}
