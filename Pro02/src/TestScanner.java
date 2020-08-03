import java.util.Scanner;//包
/**
 * 测试Scannner
 * @author 徐圳
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//IO流
		System.out.println("请输入名字：");
		String name=scanner.nextLine();
		System.out.println("请输入您的爱好：");
		String favor=scanner.nextLine();
		System.out.println("请输入您的年龄：");
		int age =scanner.nextInt();
		
		System.out.println("##############");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
		System.out.println("来到地球的天数："+age*365);
	}
}
