/**
 * ����break continue
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
				continue;//��ֹ����ѭ��
			   //break;//��ֹ����ѭ��
			}
			System.out.println("û��88");
		}
		//System.out.println("game over "+"used "+total+" times");
	}
}
