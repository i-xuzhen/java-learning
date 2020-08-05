package cn.xu.Decorate;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 测试转换流：
 * InputStreamReader
 * OutputStreamWriter
 * 1、以字符流的形式操作字节流（纯文本的)
 * 2、指定字符集
 */
public class ConvertTest02 {
    public static void main(String[] args) {
        //test01();
        test02();
    }

    public static void test01(){
        //操作网络流，下载百度的源代码
        try (/*InputStream is=new URL("http://www.baidu.com").openStream();*///字节数不够造成乱码，代码26行一个字节一个字节的读，但文字一个字占3个字节
                InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8");) {
            int temp = -1;
            while ((temp = is.read()) != -1) {
                System.out.print((char) temp);
            }

        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static void test02(){
        //操作网络流，下载百度的源代码
        try (/*InputStream is=new URL("http://www.baidu.com").openStream();*/
                BufferedReader reader = new BufferedReader(//为处理方便，提升效率
                        new InputStreamReader(//URL网络流，用InputStreamReader转化一下字符集，避免乱码
                                new URL("http://www.baidu.com").openStream(), "UTF-8")
                                                            );
                BufferedWriter writer=new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("baidu.html"),"UTF-8")
                                                        );
            ) {
            String msg;
            while ((msg = reader.readLine()) != null) {
                //System.out.print(msg);
                writer.write(msg);//字符集不统一才会出现乱码
                writer.newLine();
            }
            writer.flush();

        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
