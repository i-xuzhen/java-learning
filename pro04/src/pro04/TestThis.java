package pro04;
/**
 * ����This
 * This ��������static�����У��������ڴ�����ĽǶ�������
 * static���ڶ���ķ��������棬����������ŵ�������ص���Ϣ(���롢��̬��������̬�������ַ�������)��
 * �����ڶ���һ˵������This
 * @author shen
 *
 */
public class TestThis {
	int a,b,c;
	TestThis(int a, int b){
		this.a=a; //this��ʾ�����õĶ���
		this.b=b;
	}
	TestThis(int a,int b,int c){
		//���صĹ������ڲ�������һ�����صĹ�����
		//��ʱ���������ĵ��ñ�����ڵ�һ��
		this(a,b);//�ȼ���this.a=a;this.b=b
		this.c=c;
	}
	void sing() { 
		
	}
	void eat() {
		this.sing();//���ñ����е�sing
		System.out.println("�����躰��ؼҳԷ���");
		
	}
	
	public static void main(String[] args) {
		TestThis hi =new TestThis(2,3);
		hi.eat();
	}
	
}
