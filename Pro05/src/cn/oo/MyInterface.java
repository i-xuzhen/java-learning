package cn.oo;
/**
 * 接口里面所有的方法都是抽象方法
 * 接口只定义规范，不定义实现
 * 接口可以多继承，可以有多个父接口
 * 接口不能定义变量，接口是稳定的，只定义不变的东西，比如：常量、抽象方法
 * 接口里面不存在私有，都是公有的pubilc
 * @author shen
 *
 */
public interface MyInterface {
	
	/*public static final*/int MAX_AGE=100;//前缀加不加都有,默认自带
	
	
	/*public abstract*/void test01();//所有方法都是抽象的，默认为抽象方法，不用加abstract
	
}

class MyClass implements MyInterface{

	@Override
	public void test01() {
		
		System.out.println(MAX_AGE);
		System.out.println("MyClass.test01");// TODO Auto-generated method stub
		
	}
}
