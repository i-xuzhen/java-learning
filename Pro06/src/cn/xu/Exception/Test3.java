package cn.xu.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����CheckedException
 * 
 * ʹ��Throws�׳��쳣
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
		char c=(char)reader.read();//��һ���ַ�
		char c2=(char)reader.read();
		System.out.println("step1");
		System.out.println(""+c+c2);

		if(reader!=null) 
		reader.close();
		
		
		
	}
}
