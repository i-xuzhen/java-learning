/**
 * 测试break continue
 * @author shen
 *
 */
public class TestBreakContinue {
	public static void main(String[] args) {
		int total =0;
		System.out.println("Begin");
		while(true) {
			total++;
			int i=(int)(100*Math.random());
			System.out.println(i);
			if(i==88) {
				continue;//终止本次循环
			   //break;//终止整个循环
			}
			System.out.println("没有88");
		}
		//System.out.println("game over "+"used "+total+" times");
	}
}
