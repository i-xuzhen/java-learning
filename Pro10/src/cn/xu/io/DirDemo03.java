package cn.xu.io;

import java.io.File;

/**
 * 递归：方法自己调用自己
 * 递归头：何时结束递归
 * 递归体：重复调用的
 */
public class DirDemo03 {
    public static void main(String[] args) {
       // System.out.println(System.getProperty("usr.dir"));
        File dir=new File("D:/eclipse-workspace/Pro10");

        printTen(1);

    }

    public static void printTen(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printTen(n+1);
    }


}
