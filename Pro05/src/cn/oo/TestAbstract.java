package cn.oo;
/*
 * ���Գ��󷽷��ͳ�����
 * ���󷽷������ڳ�������
 * �������п��Զ�����ͨ����
 */
//��������԰������ԡ����������췽�������ǹ��췽����������new��ֻ��������������ã�super)
//������ֻ���������̳�

abstract public class TestAbstract {//�����಻��ʵ����������new��������
	
	//���󷽷�����һû��ʵ�֣��ڶ��������ʵ��
	abstract public void shout();//��������淶
	
	public void run() {
		System.out.println("�ܰ��ܣ�");
	}
	public static void main(String[] args) {
		//TestAbstract a1=new TestAbstract();����New
		Dog01 d1=new Dog01();//����������new
		d1.shout();
		
		
		Integer i;
	}
}

class Dog01 extends TestAbstract{

	@Override
	public void shout() {
		
		System.out.println("�ннУ���");
		// TODO Auto-generated method stub
		
	}
	
}
