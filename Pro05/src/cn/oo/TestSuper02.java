package cn.oo;
/**
 * ����super()׷������
 * super()д�벻д����Զλ�ڹ������ĵ�һ��
 * static{}��ľ�̬��ʼ����Ҳ��super()��׷��ԭ��һ��
 * @author shen
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("��ʼ����һ��ChildClass����------");
		//ChildClass2 stu1;//��ִ����ľ�̬��ʼ��
		ChildClass2 stu1=new ChildClass2();
		//new ChildClass2();//ִ����ľ�̬��ʼ��
		stu1.fun();
		System.out.println(stu1.a);
		//System.out.println(stu1.b);
		//System.out.println(stu1.c);
	}
}


class FatherClass2{
	static int a=1;
	private int b=2;
	static {
		System.out.println("���˳");
		//fun();
	}
	//private static void fun()
	public static void fun() {
		System.out.println("�����ܷ�̳�");
	}
	public FatherClass2() {
		//super();
		System.out.println("����FatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	private int c=3;
	static {
		System.out.println("����");
	}
	/*public static void fun() {
		System.out.println("��");
	}*/
	public ChildClass2() {
		super();
		System.out.println("����ChildClass");
	}
}