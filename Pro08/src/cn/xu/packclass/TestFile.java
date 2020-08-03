package cn.xu.packclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 测试File类的基本用法
 * @author shen
 *
 */
public class TestFile {
	
	public static void main(String[] args) throws IOException {
		//打印项目的路径
		System.out.println(System.getProperty("user.dir"));
		File f=new File("d:/eclipse-workspace/a.txt");
		f.createNewFile();
		System.out.println("File是否存在："+f.exists());
		System.out.println("File是否是目录："+f.isDirectory());
		System.out.println("File是否是文件："+f.isFile());
		System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
		
		//f.delete();
		System.out.println("#########");
        
		File f2=new File("d:/eclipse-workspace/电影");
		boolean flag=f2.mkdir();
		System.out.println(flag);
		System.out.println("File是否是目录："+f2.isDirectory());
		//f2.delete();

        
		
		
	}
}
