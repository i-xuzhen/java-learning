/**
 * 测试递归
 * 递归费资源 尽量不用递归
 * @author shen
 *
 */
public class TestDigui {
	public static void main(String[] args) {
		//a();
		long d1=System.currentTimeMillis();
		System.out.printf("%d阶乘的结果:%s%n",10,factorial(10));
		//System.out.println(factorial(10));
		long d2=System.currentTimeMillis();
		System.out.printf("递归费时：%s%n",d2-d1);
		
		factorialLoop(10);
		
	}
	
	static int count=0;
	public static void a() {
		count++;
		System.out.println("a");
		if(count<=10) {//递归头
			a();
		}else {		   //递归体
			return;
		}	
	}
	//求阶乘的方法
	public static long factorial(int n) {
		if(n==1) {    //递归头
			return 1;
		}else {		  //递归体
			return n*factorial(n-1);
		}
	}
	static long factorialLoop(int a) {
		    long d3 = System.currentTimeMillis();
		    int result = 1;
		    while (a > 1) {
		    	result *= a * (a - 1);
		    	a -= 2;
		    }
		    long d4 = System.currentTimeMillis();
		    System.out.println(result);
		    System.out.printf("普通循环费时：%s%n", d4 - d3);
		    return result;
	}

	

}
