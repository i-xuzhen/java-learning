package cn.oo;
/**
 * ���Ծ�̬�ڲ���
 * @author shen
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		Outer2.Inner2 inner=new Outer2.Inner2();
		//�����ڷǾ�̬�ڲ��ࣺ
		//Outer2.Inner2 inner = new Outer2().new Inner2();
	}
}


class Outer2{
	
	static class Inner2{
		
	}
	
}