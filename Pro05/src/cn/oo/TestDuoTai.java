package cn.oo;
/**
 * ���Զ�̬,��Է����Ķ�̬������û�ж�̬
 * ��̬�ı�Ҫ�������̳С�������д����������ָ���������
 * @author shen
 *
 */
public class TestDuoTai {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal c=new Cat();//��������ָ���������//����ת��
		//c.seeDoor();//��ʱ��������Ϊc��Animal�����ܵ���Cat�ķ���
		Cat c2=(Cat)c;//ǿ������ת��
		c2.seeDoor();
		
		//Dog d1=(Dog)c2;//����ƽ��ת
		//Dog d1=(Dog)c;//����ת��ʹ�Ǳ�����ͨ���ˣ�Ҳ�ᱨ��
		
		animalCry(a);
		Dog d=new Dog();
		animalCry(d);
	}
	
	static void animalCry(Animal a) {//��������ָ��������󣡶�̬�ؼ�
		a.shout();
	}
}

 class Animal{
	 public void shout() {
		System.out.println("����һ����");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("��������");
	}

}
class Cat extends Animal{
	public void shout() {
		System.out.println("����������");
	}
	public void seeDoor() {
		System.out.println("�����У�");
	}
}

