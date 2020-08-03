/**
 * 
 * @author shen
 *
 */
public class TestFangfa {
	public static void main(String[] args) {
		int num1=20;
		int num2=30;
		//int sum=add(num1,num2);
		//System.out.println("sum="+sum);
		//print();
		TestFangfa tm = new TestFangfa();
		int sum=tm.add(num1,num2);
		System.out.println("sum="+sum);
	}
	public static int add(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	 void print() {
		System.out.println("ĞìÛÚ¼ÓÓÍ£¡");
	}
}
