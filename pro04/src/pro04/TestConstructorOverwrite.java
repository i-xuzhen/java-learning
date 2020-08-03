package pro04;
/**
 * 构造器的重载
 * @author shen
 *
 */
public class TestConstructorOverwrite {
	int id;
	String name;
	String pwd;
	
	public TestConstructorOverwrite() {
		
	}
	public TestConstructorOverwrite(int id,String name) {
		super();//构造方法的第一句总是super()
		this.id=id;  //this表示创建好的对象
		this.name=name;
	}
	public TestConstructorOverwrite(int id,String name,String pwd) {
		this.id=id;
		this.name=name;
		this.pwd=pwd;
	}
	
	public static void main(String[] args) {
		TestConstructorOverwrite u1= new TestConstructorOverwrite();
		TestConstructorOverwrite u2= new TestConstructorOverwrite(100,"徐圳");
		TestConstructorOverwrite u3= new TestConstructorOverwrite(101,"王盛","xz123456");
	}
}
