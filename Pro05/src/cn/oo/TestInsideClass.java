package cn.oo;
/**
 * 测试内部类:非静态内部类
 * @author shen
 *
 */
public class TestInsideClass {
	public static void main(String[] args) {
		//创建内部类对象
		Outer.Inner inner=new Outer().new Inner();
	//	Outer.Inner inner=new Outer.Inner();
		
		inner.show();
	}

}

class Outer{//外部类的静态方法和静态代码块不能访问非静态内部类
	private int age=10;
	public void testOuter() {
		System.out.println("testOuter");
		//外部类不能调用内部类的成员
		//System.out.println("内部类的成员变量age:"+Inner.age);
	}
//	static {
//		System.out.println("内部类的成员变量age:"+Inner.age);
//	}
	
	
	//非静态内部类不能有静态方法、静态属性和静态初始化块
/*static*/	class Inner{//加就是静态内部类，不加就是非静态内部类
/*static*/	int age=30;
		public void show() {
			int age=20;
			//内部类可以直接访问外部类的成员
			System.out.println("外部类的成员变量age:"+Outer.this.age);
			System.out.println("内部类的成员变量age:"+this.age);
			System.out.println("局部变量age:"+age);
		}
	}
	
	
	
}