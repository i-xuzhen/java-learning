package pro04;
/**
 * 测试静态字、静态方法static
 * static修饰的成员变量和方法从属类，称为类变量，其生命周期和类相同
 * 在整个应用程序执行期间都有效
 * 普通的变量和方法属于对象
 * @author shen
 *
 */
public class TestStatic {
	int id;
	String name;
	String pwd;
	static String company="电子科技大学";
	
	public TestStatic(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void login() {
		printCompany();//普通方法里面可以调静态方法
		System.out.println(company);//普通方法里面可以调静态变量
		System.out.println("登录："+name);
	}
	
	public static void printCompany() {
		//login();//静态方法里面不能使用非静态方法
		//this.id=1;//this代表对象，但静态方法是存于方法块（是与类相关的抽象信息），没有对象可言，故不能用this
		System.out.println(company);//静态方法里面能使用静态变量
	}
	public static void main(String[] args) {
		TestStatic u= new TestStatic(101,"徐圳");
		TestStatic.printCompany();
		TestStatic.company="徐圳大哥哥！";
		TestStatic.printCompany();
	}
}
