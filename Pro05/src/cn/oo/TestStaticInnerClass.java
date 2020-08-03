package cn.oo;
/**
 * 测试静态内部类
 * @author shen
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		Outer2.Inner2 inner=new Outer2.Inner2();
		//区别于非静态内部类：
		//Outer2.Inner2 inner = new Outer2().new Inner2();
	}
}


class Outer2{
	
	static class Inner2{
		
	}
	
}