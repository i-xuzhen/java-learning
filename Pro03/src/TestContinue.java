/**
 * ≤‚ ‘continue
 * @author shen
 *
 */
public class TestContinue {
	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=150;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
			count++;
			if(count==5) {
				System.out.println();
				count=0;
			}
		}
	}
}
