/**
 * ����Switch
 * @author shen
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		char c='a';
		int rand =(int)(26*Math.random());
		char c2=(char)(c+rand);
		switch(c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
		
		}
		System.out.println(c2);
	}
}
