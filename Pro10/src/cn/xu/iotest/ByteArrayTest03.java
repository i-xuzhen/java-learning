package cn.xu.iotest;

import java.io.*;

/**
 * 测试：读取图片成为字节数组，再将字节数组还原为图片
 * <p>
 * 图片<-->程序<-->字节数组
 * 仍然以程序为中心
 * 1）使用文件输入流：将图片读取到程序
 * 2）再使用字节数组输出流：把它写字节数组
 * 3）再使用字节数组输入流：把字节数组返回给程序
 * 4）最后使用文件输出流，还原成图片
 * <p>
 * 获取数据：toByteArray()
 * ByteArrayInputStream
 * ByteArratOutputStream
 */
public class ByteArrayTest03 {
    public static void main(String[] args) {
        byte[] datas = fileToByteArray("D:\\eclipse-workspace\\Pro10\\src\\ball.png");
        System.out.println(datas.length);
        byteArrayToFile(datas, "cball.png");


    }

    /**
     * 1.图片读到字节数组中
     * 1)图片到程序 FileInputStream
     * 2）程序到字节数组 ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath) {
        //1.创建源
        File src = new File(filePath);
        byte[] dest = null;
        //2.选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            //3.操作
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                baos.write(flush, 0, len);
            }


            baos.flush();
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 2.字节数组写出到图片
     * 1)字节数组读取到程序中ByteInputStream
     * 2）程序写出到文件中FileOutputStream
     */
    public static void byteArrayToFile(byte[] src, String filePath) {
        //1.创建源
        File dest = new File(filePath);
        //2.创建流
        InputStream is = null;
        FileOutputStream os = null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
