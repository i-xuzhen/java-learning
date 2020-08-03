package pro04;
/**
 * 测试This
 * This 不能用于static方法中！！！从内存分析的角度来分析
 * static存于堆里的方法区里面，而方法区存放的是类相关的信息(代码、静态变量、静态方法、字符串常量)，
 * 不存在对象一说则不能用This
 * @author shen
 *
 */
public class TestThis {
	int a,b,c;
	TestThis(int a, int b){
		this.a=a; //this表示创建好的对象
		this.b=b;
	}
	TestThis(int a,int b,int c){
		//重载的构造器内部调用另一个重载的构造器
		//此时，构造器的调用必须放在第一句
		this(a,b);//等价于this.a=a;this.b=b
		this.c=c;
	}
	void sing() { 
		
	}
	void eat() {
		this.sing();//调用本类中的sing
		System.out.println("你妈妈喊你回家吃饭！");
		
	}
	
	public static void main(String[] args) {
		TestThis hi =new TestThis(2,3);
		hi.eat();
	}
	
}
