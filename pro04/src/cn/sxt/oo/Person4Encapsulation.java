package cn.sxt.oo;
/*
 * 继续测试封装
 */
public class Person4Encapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if(age>+1&&age<=130) {
			this.age=age;
		}else {
			System.out.println("请输入正常年龄");
		}
	}
	public int getAge() {
		return this.age;
	}
	//#####################shift+alt+s自动生成
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}
