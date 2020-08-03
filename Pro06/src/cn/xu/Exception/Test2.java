package cn.xu.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����CheckedException
 * 
 * ʹ��Try catch�����쳣
 * @author shen
 *
 */
public class Test2 {
	public static void main(String[] args) {
		readMyFile();
	}
	
	
	public static void readMyFile() {
		FileReader reader=null;
		try {
			reader=new FileReader("d:/eclipse-workspace/a.txt");
			char c=(char)reader.read();//��һ���ַ�
			char c2=(char)reader.read();
			System.out.println("step1");
			System.out.println(""+c+c2);
	}catch(FileNotFoundException e) {//��catch�Ļ���������ǰ�����ں�
		System.out.println("step2");
		e.printStackTrace();
	}catch(IOException e) {
		
		System.out.println("step3");
		e.printStackTrace();
	}finally {
		
		System.out.println("step4");
		try {
			if(reader!=null) {
				reader.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
	}
}