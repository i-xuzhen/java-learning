/**
 * ²âÊÔÇ¶Ì×Ñ­»·
 * @author ĞìÛÚ
 *
 */
public class TestForFor {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.print('\n');
		}
		System.out.println("##################");
		
		int sum01=0;
		int sum02=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum01+=i;
			}
			else {
				sum02+=i;
			}
		}
		System.out.println(sum01);
		System.out.println(sum02);
		
		System.out.println("###########");
		
		int flag=0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
					System.out.print(i+"\t");
					flag++;
					if(flag==5) {
						System.out.println();
						flag=0;
					}
			}
		}
	}
}
