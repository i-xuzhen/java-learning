package cn.oo.shuzu;
/**
 * ������������ֳ�ʼ����ʽ
 * @author shen
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//��̬��ʼ��
		int[] a= {1,2,65};
		System.out.println(a.length);
		User[] b= {
				new User(1001,"����"),
				new User(1002,"����"),
				new User(1003,"����")
				};
		//��̬��ʼ����ֱ��ͨ���±긳ֵ
		int[] a1=new int[3];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		//Ĭ�ϳ�ʼ��
		int[] c=new int[3];//int Ĭ��ֵΪ0��boolean Ĭ��ֵΪfalse;��������Ĭ��ֵΪnull
	}
}
