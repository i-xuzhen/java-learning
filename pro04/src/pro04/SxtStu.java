package pro04;

public class SxtStu {
	//属性
	int id;
	String name;
	int age;
	
	Computer comp;////类与类之间可以嵌套
	
	//方法
	void study() {
		System.out.println("我正在努力学习！使用电脑："+comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏！");
	}
	//构造方法???----->>>>用于创建这个类的对象
	//无参数的构造方法可以不写，由系统自动创建
	//名字和类一致
	SxtStu(){
		
	}
	//程序执行入口javac SxtStu.java  java SxtStu
	public static void main(String[] args) {
		SxtStu stu =new SxtStu();//通过调用SxtStu这个类的构造方法创建一个对象
		stu.id=1001;
		stu.name="徐圳";
		stu.age=17;
		Computer c1 =new Computer();
		c1.brand="联想";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
	}
}

//类与类之间可以嵌套
class Computer{
	String brand;
}

