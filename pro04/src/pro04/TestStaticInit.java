package pro04;
/**
 * ���Ծ�̬��ʼ����
 * �����ڹ��췽�������췽����������ĳ�ʼ������̬��ʼ������������ĳ�ʼ��
 * �̳У�����ѧϰ������ٿ�
 * @author shen
 *
 */
public class TestStaticInit {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {//���й����������ڹ�����֮ǰִ�У���Ϊ�ȼ����࣬���ܹ������
		System.out.println("ִ����ĳ�ʼ������");
		company="������ѧ��";
		printCompany();
	}
	public static void printCompany() {
		System.out.println(company);
	}
	public static void main(String[] args) {
		//TestStaticInit u3= new TestStaticInit();
		//TestStaticInit u3= null;
	}
}
