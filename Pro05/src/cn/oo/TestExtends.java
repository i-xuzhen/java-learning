package cn.oo;
/**
 * ���Լ̳�
 * java���൥�̳У�������������C++��̳�
 * JAVA�Ľӿ��ǿ��Զ�̳еģ�
 * �������һ����û�е���extendsʱ�������ĸ�����java.lang.Object
 * ����ʹ��Ctral+T�鿴��ļ̳нṹ
 * @author shen
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student s= new Student("����",175,"java");
		s.rest();
		s.study();
		System.out.println(s.name+s.height+s.major);
		System.out.println(s instanceof Person);//�鿴��ߵĶ����Ƿ�Ϊ�ұߵ�����������
		System.out.println(s instanceof Student);
		System.out.println(new Person() instanceof Student);
	}
	
}

class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("��Ϣһ�����");
	}
}

class Student extends Person{//���Եõ������ȫ�����Ժͷ���������Ĺ��췽�����⣩���������ÿ���ֱ�ӷ��ʣ��縸���˽�����Ժͷ�����
	String major;
	public void study() {
		System.out.println("��ѧϰjava");
	}
	public Student(String name, int height,String major) {
		this.name=name;
		this.height=height;
		this.major=major;
	}
	public Student() {
		
	}//�ֶ������˹��������չ�����ϵͳ�Ͳ��Զ�����
}


