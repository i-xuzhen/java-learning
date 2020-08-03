package cn.xu.Exception;
/**
 * �����Զ����쳣
 * @author shen
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(-16);
	}
}


class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			throw new IllegalAgeException("���䲻��Ϊ����");
		}
		this.age = age;
	}
	
}

//�����Ը�Ϊ
//class IllegalAgeException extends Exception
//��������ʱ�쳣����Ҫ�׳�
class IllegalAgeException extends RuntimeException{
	public IllegalAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public IllegalAgeException(String msg) {
		super(msg);
	}
}