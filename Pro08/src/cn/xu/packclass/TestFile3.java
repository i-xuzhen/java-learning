package cn.xu.packclass;

import java.io.File;

/**
 * ����ʹ�õݹ����Ŀ¼�ṹ����״չ��
 * @author shen
 *
 */
public class TestFile3 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\shen\\Desktop\\�о����ļ�");
		printFile(f,0);
	
	}
	
	
	static void printFile(File file,int level) {
		for(int i=0;i<=level;i++) {
			System.out.print("#");
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files=file.listFiles();
			for(File temp:files){
				printFile(temp,level+1);
			}
		}	
	}
	
	
	
	
	
	
}