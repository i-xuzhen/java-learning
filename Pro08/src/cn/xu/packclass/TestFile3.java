package cn.xu.packclass;

import java.io.File;

/**
 * 测试使用递归遍历目录结构和树状展现
 * @author shen
 *
 */
public class TestFile3 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\shen\\Desktop\\研究生文件");
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
