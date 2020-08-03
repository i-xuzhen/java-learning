package cn.xu.io;

import java.io.File;

/**
 * 使用面向对象：统计文件夹的大小
 */
public class DirDemo06 {
    //大小
    private long len;
    //文件夹
    private String path;
    //源
    private File src;
    //文件的个数
    private int fileSize;
    //文件夹个数
    private int dirSize;

    public DirDemo06(String path) {
        this.path = path;
        this.src = new File(path);
        count((this.src));
    }

    //统计大小
    public void count(File src) {
        if (null != src && src.exists()) {
            if (src.isFile()) {//才有大小
                len += src.length();
                this.fileSize++;
            } else {//子孙级
                this.dirSize++;
                for (File s : src.listFiles()) {
                    count(s);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }

    public static void main(String[] args) {
        DirDemo06 dir = new DirDemo06("D:/eclipse-workspace/Pro10/src");
        System.out.println(dir.getLen());
        System.out.println(dir.getDirSize());//包含了自身
        System.out.println(dir.getFileSize());
    }

}
