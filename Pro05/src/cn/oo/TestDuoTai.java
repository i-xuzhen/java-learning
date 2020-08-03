package cn.oo;
/**
 * 测试多态,针对方法的多态，属性没有多态
 * 多态的必要条件：继承、方法重写、父类引用指向子类对象
 * @author shen
 *
 */
public class TestDuoTai {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal c=new Cat();//父类引用指向子类对象！//向上转型
		//c.seeDoor();//此时编译器认为c是Animal，不能调用Cat的方法
		Cat c2=(Cat)c;//强制向下转型
		c2.seeDoor();
		
		//Dog d1=(Dog)c2;//不能平级转
		//Dog d1=(Dog)c;//这样转即使是编译器通过了，也会报错
		
		animalCry(a);
		Dog d=new Dog();
		animalCry(d);
	}
	
	static void animalCry(Animal a) {//父类引用指向子类对象！多态关键
		a.shout();
	}
}

 class Animal{
	 public void shout() {
		System.out.println("叫了一声！");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪！");
	}

}
class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵喵！");
	}
	public void seeDoor() {
		System.out.println("看门中！");
	}
}

