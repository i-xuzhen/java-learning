package cn.xu.packclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * ����File��Ļ����÷�
 * @author shen
 *
 */
public class TestFile {
	
	public static void main(String[] args) throws IOException {
		//��ӡ��Ŀ��·��
		System.out.println(System.getProperty("user.dir"));
		File f=new File("d:/eclipse-workspace/a.txt");
		f.createNewFile();
		System.out.println("File�Ƿ���ڣ�"+f.exists());
		System.out.println("File�Ƿ���Ŀ¼��"+f.isDirectory());
		System.out.println("File�Ƿ����ļ���"+f.isFile());
		System.out.println("File�Ĵ�С��"+f.length());
        System.out.println("File���ļ�����"+f.getName());
        System.out.println("File��Ŀ¼·����"+f.getPath());
        System.out.println("File����޸�ʱ�䣺"+new Date(f.lastModified()));
		
		//f.delete();
		System.out.println("#########");
        
		File f2=new File("d:/eclipse-workspace/��Ӱ");
		boolean flag=f2.mkdir();
		System.out.println(flag);
		System.out.println("File�Ƿ���Ŀ¼��"+f2.isDirectory());
		//f2.delete();

        
		
		
	}
}
