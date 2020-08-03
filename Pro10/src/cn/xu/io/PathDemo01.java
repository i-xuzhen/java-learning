package cn.xu.io;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;

public class PathDemo01 {
    public static void main(String[] args) {
        String path="D:\\eclipse-workspace\\Pro10\\src\ball.png";
        System.out.println(File.separatorChar);
        //名称分隔符
        //1.建议使用 ：/
        path="D:/eclipse-workspace/Pro10/src/ball.png";
        System.out.println(path);
        //2.常量拼接
        path="D:"+File.separatorChar+"eclipse-workspace"+File.separatorChar+"Pro10"+File.separatorChar+"src"+File.separatorChar+"ball.png";
        System.out.println(path);

    }
}
