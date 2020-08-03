package cn.oo;
/**
 * 重载Overload
 * 测试方法的重写Override
 * @author shen
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Horse();
		Vehicle v3=new Plane();
		v1.run();
		v2.run();
		v3.run();
		v2.stop();
		v3.stop();
	}
}

class Vehicle{
	public void run() {
		System.out.println("跑....");
	}
	public void stop() {
		System.out.println("停止不动");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("四蹄翻飞，嘚嘚嘚嘚....");
	}
	public Student whoIsPsg() {//返回值类型和声明异常类型，子类小于等于父类
		return new Student();
	}
	/*public Object whoIsPsg() {//返回值类型和声明异常类型，子类小于等于父类
		return new Object();
	}*/
	
}

class Plane extends Vehicle{
	public void run() {
		System.out.println("天上飞");
	}
	public void stop() {
		System.out.println("空中不能停，坠毁了！");
	}
}