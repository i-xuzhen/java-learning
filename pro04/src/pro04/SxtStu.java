package pro04;

public class SxtStu {
	//����
	int id;
	String name;
	int age;
	
	Computer comp;////������֮�����Ƕ��
	
	//����
	void study() {
		System.out.println("������Ŭ��ѧϰ��ʹ�õ��ԣ�"+comp.brand);
	}
	
	void play() {
		System.out.println("��������Ϸ��");
	}
	//���췽��???----->>>>���ڴ��������Ķ���
	//�޲����Ĺ��췽�����Բ�д����ϵͳ�Զ�����
	//���ֺ���һ��
	SxtStu(){
		
	}
	//����ִ�����javac SxtStu.java  java SxtStu
	public static void main(String[] args) {
		SxtStu stu =new SxtStu();//ͨ������SxtStu�����Ĺ��췽������һ������
		stu.id=1001;
		stu.name="����";
		stu.age=17;
		Computer c1 =new Computer();
		c1.brand="����";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
	}
}

//������֮�����Ƕ��
class Computer{
	String brand;
}

