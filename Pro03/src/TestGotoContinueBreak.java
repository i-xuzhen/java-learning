/**
 * ���Դ���ǩ��break continue
 * @author shen
 *
 */
public class TestGotoContinueBreak {
	public static void main(String[] args) {
		outer:for(int i=101;i<=150;i++) {//��101-150֮�������
			for(int j=2;j<i/j;j++) {
				if(i%j==0) {
					//break;
					continue outer;
				}
			}
			System.out.print(i+" ");
		}
	}
}
