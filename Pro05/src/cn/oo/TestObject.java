package cn.oo;

public class TestObject {
	public static void main(String[] args) {
		//Object obj;
		TestObject to= new TestObject();
		System.out.println(to.toString());		

		Person2 p=new Person2("����",17);
		System.out.println("info:"+p);
		p.age=20;
		p.name="�";
		System.out.println("info:"+p);
		System.out.println(to);
		 
	}
	
    public String toString() {
        return "����Object";
    }
    
}

class Person2{
	String name;
	int age;
	public String toString() {
		return name+",���䣺"+age;
	}
	public Person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}