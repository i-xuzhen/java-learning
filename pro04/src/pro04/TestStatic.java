package pro04;
/**
 * ���Ծ�̬�֡���̬����static
 * static���εĳ�Ա�����ͷ��������࣬��Ϊ����������������ں�����ͬ
 * ������Ӧ�ó���ִ���ڼ䶼��Ч
 * ��ͨ�ı����ͷ������ڶ���
 * @author shen
 *
 */
public class TestStatic {
	int id;
	String name;
	String pwd;
	static String company="���ӿƼ���ѧ";
	
	public TestStatic(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void login() {
		printCompany();//��ͨ����������Ե���̬����
		System.out.println(company);//��ͨ����������Ե���̬����
		System.out.println("��¼��"+name);
	}
	
	public static void printCompany() {
		//login();//��̬�������治��ʹ�÷Ǿ�̬����
		//this.id=1;//this������󣬵���̬�����Ǵ��ڷ����飨��������صĳ�����Ϣ����û�ж�����ԣ��ʲ�����this
		System.out.println(company);//��̬����������ʹ�þ�̬����
	}
	public static void main(String[] args) {
		TestStatic u= new TestStatic(101,"����");
		TestStatic.printCompany();
		TestStatic.company="���ڴ��磡";
		TestStatic.printCompany();
	}
}
