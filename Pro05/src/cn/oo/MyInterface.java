package cn.oo;
/**
 * �ӿ��������еķ������ǳ��󷽷�
 * �ӿ�ֻ����淶��������ʵ��
 * �ӿڿ��Զ�̳У������ж�����ӿ�
 * �ӿڲ��ܶ���������ӿ����ȶ��ģ�ֻ���岻��Ķ��������磺���������󷽷�
 * �ӿ����治����˽�У����ǹ��е�pubilc
 * @author shen
 *
 */
public interface MyInterface {
	
	/*public static final*/int MAX_AGE=100;//ǰ׺�Ӳ��Ӷ���,Ĭ���Դ�
	
	
	/*public abstract*/void test01();//���з������ǳ���ģ�Ĭ��Ϊ���󷽷������ü�abstract
	
}

class MyClass implements MyInterface{

	@Override
	public void test01() {
		
		System.out.println(MAX_AGE);
		System.out.println("MyClass.test01");// TODO Auto-generated method stub
		
	}
}
