/**
 * ���Զ�ѡ��ṹ
 * @author shen
 *
 */
public class TestMultIFELSE {
	public static void main(String[] args) {
		int age=(int)(100*Math.random());
		if(age<15) {
			System.out.println("��ͯ��ϲ���棡");
		}else if(age<45){
			System.out.println("���꣬Ҫѧϰ��");
		}else if(age<65) {
			System.out.println("�����꣬���˶�");
		}else if(age<85) {
			System.out.println("���꣬ѧ���¶�������������̬��");
		}else {
			System.out.println("�����ǣ�");
		}
	}
}
