package cn.oo;
/**
 * ����Overload
 * ���Է�������дOverride
 * @author shen
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Horse();
		Vehicle v3=new Plane();
		v1.run();
		v2.run();
		v3.run();
		v2.stop();
		v3.stop();
	}
}

class Vehicle{
	public void run() {
		System.out.println("��....");
	}
	public void stop() {
		System.out.println("ֹͣ����");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("���㷭�ɣ��N�N�N�N....");
	}
	public Student whoIsPsg() {//����ֵ���ͺ������쳣���ͣ�����С�ڵ��ڸ���
		return new Student();
	}
	/*public Object whoIsPsg() {//����ֵ���ͺ������쳣���ͣ�����С�ڵ��ڸ���
		return new Object();
	}*/
	
}

class Plane extends Vehicle{
	public void run() {
		System.out.println("���Ϸ�");
	}
	public void stop() {
		System.out.println("���в���ͣ��׹���ˣ�");
	}
}