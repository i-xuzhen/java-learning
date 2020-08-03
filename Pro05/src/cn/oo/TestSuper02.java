package cn.oo;
/**
 * 测试super()追溯问题
 * super()写与不写都永远位于构造器的第一句
 * static{}类的静态初始化块也和super()的追溯原理一致
 * @author shen
 *
 */
public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象------");
		//ChildClass2 stu1;//不执行类的静态初始化
		ChildClass2 stu1=new ChildClass2();
		//new ChildClass2();//执行类的静态初始化
		stu1.fun();
		System.out.println(stu1.a);
		//System.out.println(stu1.b);
		//System.out.println(stu1.c);
	}
}


class FatherClass2{
	static int a=1;
	private int b=2;
	static {
		System.out.println("徐成顺");
		//fun();
	}
	//private static void fun()
	public static void fun() {
		System.out.println("测试能否继承");
	}
	public FatherClass2() {
		//super();
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	private int c=3;
	static {
		System.out.println("徐圳");
	}
	/*public static void fun() {
		System.out.println("能");
	}*/
	public ChildClass2() {
		super();
		System.out.println("创建ChildClass");
	}
}