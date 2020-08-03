package cn.oo;
/**
 * 测试继承
 * java的类单继承！！！！区别于C++多继承
 * JAVA的接口是可以多继承的！
 * 若定义个一个类没有调用extends时，则它的父类是java.lang.Object
 * 可以使用Ctral+T查看类的继承结构
 * @author shen
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student s= new Student("徐圳",175,"java");
		s.rest();
		s.study();
		System.out.println(s.name+s.height+s.major);
		System.out.println(s instanceof Person);//查看左边的对象是否为右边的类所创建的
		System.out.println(s instanceof Student);
		System.out.println(new Person() instanceof Student);
	}
	
}

class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("休息一会儿！");
	}
}

class Student extends Person{//可以得到父类的全部属性和方法（父类的构造方法除外），但不见得可以直接访问（如父类的私有属性和方法）
	String major;
	public void study() {
		System.out.println("在学习java");
	}
	public Student(String name, int height,String major) {
		this.name=name;
		this.height=height;
		this.major=major;
	}
	public Student() {
		
	}//手动构造了构造器，空构造器系统就不自动加了
}


