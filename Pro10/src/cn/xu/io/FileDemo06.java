package cn.xu.io;

import java.io.File;
import java.io.IOException;

/**
 * creatNewFile()  不存在才创建
 * delete()删除已经存在的文件
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        File src=new File("D:/eclipse-workspace/Pro10/src/io.txt");
        boolean flag = src.createNewFile();
        System.out.println(flag);

        //不是文件夹
        src=new File("D:/eclipse-workspace/Pro10/xu");
        flag = src.createNewFile();
        System.out.println(flag);

        flag = src.delete();
        System.out.println(flag);

        //补充：con com3...是操作系统的设备名，不能正确创建
        src=new File("D:/eclipse-workspace/Pro10/con");
        flag = src.createNewFile();
        System.out.println(flag);


    }
}
