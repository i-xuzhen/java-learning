package pro04;
/**
 * 测试静态初始化块
 * 区别于构造方法，构造方法是做对象的初始化，静态初始化块用于做类的初始化
 * 继承？？？学习后回来再看
 * @author shen
 *
 */
public class TestStaticInit {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {//若有构造器，会在构造器之前执行，因为先加载类，才能构造对象
		System.out.println("执行类的初始化工作");
		company="北京尚学堂";
		printCompany();
	}
	public static void printCompany() {
		System.out.println(company);
	}
	public static void main(String[] args) {
		//TestStaticInit u3= new TestStaticInit();
		//TestStaticInit u3= null;
	}
}
