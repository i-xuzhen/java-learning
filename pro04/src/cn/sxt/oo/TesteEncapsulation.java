package cn.sxt.oo;
/**
 * ���Է�װprivate default protected public
 * @author shen
 *
 */
public class TesteEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//h.age=13;
		h.name="����";
		
		Person4Encapsulation p4=new Person4Encapsulation();
		p4.setAge(48);
		System.out.println(p4.getAge());
		p4.setName("����");
		System.out.println(p4.getName());
		p4.getName();
	}
}


 class Boy extends Human{//Boy�̳���Human��˽������age�����ǲ���ʹ�ã���
	void sayHello() {
		System.out.println(name);//�����޷�ʹ�ø����˽�����Ժͷ�����
	}
}