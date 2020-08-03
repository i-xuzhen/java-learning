package cn.xu.io;

import java.io.File;

/**
 * 名称或路径
 * getName()
 * getPath():构建时是相对路径就返回相对路径，是绝对路径就返回绝对路径
 * getAbsolutePath()绝对路径
 * getParent():父路径  ，不存在则返回空
 */
public class FileDemo03 {
    public static void main(String[] args) {
       File src=new File("D:/eclipse-workspace/Pro10/src/ball.png");
       // File src=new File("ball.png");

        //基本信息
        System.out.println("名称:"+src.getName());
        System.out.println("路径："+src.getPath());
        System.out.println("绝对路径："+src.getAbsolutePath());
        System.out.println("父路径："+src.getParent());
        System.out.println("父对象："+src.getParentFile().getName());


    }
}
