package cn.xu.io;

import java.io.File;

/**
 * 文件状态：
 * 1.不存在：exists
 * 2.存在：
 *          文件:isFile
 *          文件夹:isDirectory
 */
public class FileDemo04 {
    public static void main(String[] args) {

        File src=new File("D:/eclipse-workspace/Pro10/src/ball.png");
        System.out.println("是否存在："+src.exists());
        System.out.println("是否为文件："+src.isFile());
        System.out.println("是否为文件夹："+src.isDirectory());

        System.out.println("############");

        src=new File("ball.png");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在："+src.exists());
        System.out.println("是否为文件："+src.isFile());
        System.out.println("是否为文件夹："+src.isDirectory());

        System.out.println("############");

        src=new File("D:/eclipse-workspace/Pro10/src");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在："+src.exists());
        System.out.println("是否为文件："+src.isFile());
        System.out.println("是否为文件夹："+src.isDirectory());

        src=new File("xxxx");
        if(src==null||!src.exists()){
            System.out.println("文件不存在！");
        }else{
            if(src.isFile()){
                System.out.println("文件操作！");
            }else {
                System.out.println("文件夹操作！");
            }
        }

    }
}
