package cn.xu.io;

import java.io.File;

/**
 * 测试file的构造器创建对象
 */
public class FileDemo01 {
    public static void main(String[] args) {
        String path="D:/eclipse-workspace/Pro10/src/ball.png";

        //方法一：构建File对象； 路径名称
        File src=new File(path);
        System.out.println(src.length());

        //方法二：父子构建
        src=new File("D:/eclipse-workspace/Pro10/src","ball.png");
        System.out.println(src.length());

        //方法三：父对象，子名称
        src=new File(new File("D:/eclipse-workspace/Pro10/src"),"ball.png");
        System.out.println(src.length());


    }
}
