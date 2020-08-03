package cn.xu.io;

import java.io.File;

/**
 * 测试file相对路径和绝对路径的概念
 * 1）存在盘符：绝对路径
 * 2）不存在盘符：相对路径
 */
public class FileDemo02 {
    public static void main(String[] args) {
        String path="D:/eclipse-workspace/Pro10/src/ball.png";

        //绝对路径
        File src=new File(path);
        System.out.println(src.getAbsolutePath());

        //相对路径  相对当前工程而言
        System.out.println(System.getProperty("user.dir"));
        src=new File("ball.png");
        System.out.println(src.getAbsolutePath());

        //构建一个不存在的文件
        src=new File("aaa/ball.png") ;
        System.out.println(src.getAbsolutePath());
    }
}
