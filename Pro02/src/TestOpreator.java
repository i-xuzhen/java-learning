/**
 * 测试算法运算符
 * @author shen
 *
 */
public class TestOpreator {
	public static void main(String[] args) {
		int a=80;
		int b=4;
		int c=a+b;
		int x=-100;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a<<2);
		String type=a>60?"及格":"不及格";
		System.out.println(type);
		System.out.println(x>0?1:(x==0?0:-1));
	}
}
