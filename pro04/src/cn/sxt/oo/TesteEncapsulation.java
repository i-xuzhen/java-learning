package cn.sxt.oo;
/**
 * 测试封装private default protected public
 * @author shen
 *
 */
public class TesteEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//h.age=13;
		h.name="徐圳";
		
		Person4Encapsulation p4=new Person4Encapsulation();
		p4.setAge(48);
		System.out.println(p4.getAge());
		p4.setName("徐圳");
		System.out.println(p4.getName());
		p4.getName();
	}
}


 class Boy extends Human{//Boy继承了Human的私有属性age，但是不能使用！！
	void sayHello() {
		System.out.println(name);//子类无法使用父类的私有属性和方法！
	}
}