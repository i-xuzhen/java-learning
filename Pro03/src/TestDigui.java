/**
 * ���Եݹ�
 * �ݹ����Դ �������õݹ�
 * @author shen
 *
 */
public class TestDigui {
	public static void main(String[] args) {
		//a();
		long d1=System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ��:%s%n",10,factorial(10));
		//System.out.println(factorial(10));
		long d2=System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n",d2-d1);
		
		factorialLoop(10);
		
	}
	
	static int count=0;
	public static void a() {
		count++;
		System.out.println("a");
		if(count<=10) {//�ݹ�ͷ
			a();
		}else {		   //�ݹ���
			return;
		}	
	}
	//��׳˵ķ���
	public static long factorial(int n) {
		if(n==1) {    //�ݹ�ͷ
			return 1;
		}else {		  //�ݹ���
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
		    System.out.printf("��ͨѭ����ʱ��%s%n", d4 - d3);
		    return result;
	}

	

}
