package cn.xu.Decorate;

import java.io.*;

/**
 * 使用文件字符输入流和输出流达到文件的拷贝
 1、创建源
 2.选择流
 3.操作（写出 内容）
 4.释放资源

 ？？？思考：利用递归，制作文件夹的拷贝
 */
public class CopyTxt {
    public static void main(String[] args) {
        copy("D:\\eclipse-workspace\\Pro10\\dest.txt","D:\\eclipse-workspace\\Pro10\\src\\abc.txt");
    }

    public static void copy(String srcPath,String destPath) {
        //1.创建源
        File src = new File(srcPath);
        File dest = new File(destPath);
        //2.选择流
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest));) {
            //3.操作
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);//逐行读出
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
