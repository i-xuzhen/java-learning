package pro04;
/**
 * ������������
 * @author shen
 *
 */
public class TestConstructorOverwrite {
	int id;
	String name;
	String pwd;
	
	public TestConstructorOverwrite() {
		
	}
	public TestConstructorOverwrite(int id,String name) {
		super();//���췽���ĵ�һ������super()
		this.id=id;  //this��ʾ�����õĶ���
		this.name=name;
	}
	public TestConstructorOverwrite(int id,String name,String pwd) {
		this.id=id;
		this.name=name;
		this.pwd=pwd;
	}
	
	public static void main(String[] args) {
		TestConstructorOverwrite u1= new TestConstructorOverwrite();
		TestConstructorOverwrite u2= new TestConstructorOverwrite(100,"����");
		TestConstructorOverwrite u3= new TestConstructorOverwrite(101,"��ʢ","xz123456");
	}
}
