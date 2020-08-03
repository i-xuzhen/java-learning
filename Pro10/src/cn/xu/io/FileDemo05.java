package cn.xu.io;

import java.io.File;

/**
 * 其它信息
 * length():字节数
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File src=new File("D:/eclipse-workspace/Pro10/src/ball.png");
        System.out.println("长度："+src.length());

        src=new File("D:/eclipse-workspace/Pro10");
        System.out.println("长度："+src.length());
    }
}
