package cn.oo;
/*
 * 测试抽象方法和抽象类
 * 抽象方法必须在抽象类中
 * 抽象类中可以定义普通方法
 */
//抽象类可以包含属性、方法、构造方法，但是构造方法不能又来new，只能用来被子类调用（super)
//抽象类只能用来被继承

abstract public class TestAbstract {//抽象类不能实例化，不能new创建对象
	
	//抽象方法：第一没有实现，第二子类必须实现
	abstract public void shout();//定义子类规范
	
	public void run() {
		System.out.println("跑啊跑！");
	}
	public static void main(String[] args) {
		//TestAbstract a1=new TestAbstract();不能New
		Dog01 d1=new Dog01();//子类对象可以new
		d1.shout();
		
		
		Integer i;
	}
}

class Dog01 extends TestAbstract{

	@Override
	public void shout() {
		
		System.out.println("叫叫叫！！");
		// TODO Auto-generated method stub
		
	}
	
}
