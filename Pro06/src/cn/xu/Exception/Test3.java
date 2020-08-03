package cn.xu.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试CheckedException
 * 
 * 使用Throws抛出异常
 * @author shen
 *
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		readMyFile();
	}
	
	
	public static void readMyFile() throws IOException {
		FileReader reader=null;
		reader=new FileReader("d:/eclipse-workspace/b.txt");
		char c=(char)reader.read();//读一个字符
		char c2=(char)reader.read();
		System.out.println("step1");
		System.out.println(""+c+c2);

		if(reader!=null) 
		reader.close();
		
		
		
	}
}
