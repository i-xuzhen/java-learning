package cn.oo;
/**
 * �����ڲ���:�Ǿ�̬�ڲ���
 * @author shen
 *
 */
public class TestInsideClass {
	public static void main(String[] args) {
		//�����ڲ������
		Outer.Inner inner=new Outer().new Inner();
	//	Outer.Inner inner=new Outer.Inner();
		
		inner.show();
	}

}

class Outer{//�ⲿ��ľ�̬�����;�̬����鲻�ܷ��ʷǾ�̬�ڲ���
	private int age=10;
	public void testOuter() {
		System.out.println("testOuter");
		//�ⲿ�಻�ܵ����ڲ���ĳ�Ա
		//System.out.println("�ڲ���ĳ�Ա����age:"+Inner.age);
	}
//	static {
//		System.out.println("�ڲ���ĳ�Ա����age:"+Inner.age);
//	}
	
	
	//�Ǿ�̬�ڲ��಻���о�̬��������̬���Ժ;�̬��ʼ����
/*static*/	class Inner{//�Ӿ��Ǿ�̬�ڲ��࣬���Ӿ��ǷǾ�̬�ڲ���
/*static*/	int age=30;
		public void show() {
			int age=20;
			//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
			System.out.println("�ⲿ��ĳ�Ա����age:"+Outer.this.age);
			System.out.println("�ڲ���ĳ�Ա����age:"+this.age);
			System.out.println("�ֲ�����age:"+age);
		}
	}
	
	
	
}