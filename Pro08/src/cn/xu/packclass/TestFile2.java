package cn.xu.packclass;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author shen
 *
 */
public class TestFile2 {
	public static void main(String[] args) throws IOException {
			File f1=new File("d:/eclipse-workspace/sxt");
			
			boolean flag=f1.exists();
			if(flag) {
				boolean flagd=f1.delete();
				if(flagd) {
					System.out.println("ɾ���ɹ���");
				}else {
					System.out.println("ɾ��ʧ��");
				}
			}else {
				boolean flagn=f1.mkdir();
				if(flagn) {
					File f2=new File("d:/eclipse-workspace/sxt/a.txt");
					f2.createNewFile();
				}else {
					System.out.println("Ŀ¼����ʧ�ܣ�");
				}
			}
			

		
	}
}

