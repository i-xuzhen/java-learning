package cn.xu.packclass;



/**
 * �����Զ�װ�䡢�Զ�����
 * @author shen
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		Integer a=234;//�Զ�װ�䣺Integer a=Integer.valueOf(234);
		int b=a;      //�Զ����䣺int b=a.intValue();
		
		Integer c=null;
		if(c!=null) {
			int d=c;//�Զ�����:������ c.intValue();
		}
		
		//���Ի���[-128,127]֮�������
		//��������ʱ��ͻ��Զ�����[-128,127]�Ķ���
		//����ÿ�����󶼷���IntegerCache.cache����������
		//ÿ��װ���ʱ���ж�������[-128,127]�����ڵĶ��󣬾�ֱ�Ӵӻ�����ȡ
		Integer in1=Integer.valueOf(-128);
		Integer in2=-128;
		System.out.println(in1==in2);//true
		System.out.println(in1.equals(in2));//true
		System.out.println("############");
		Integer in3=1234;
		Integer in4=1234;
		System.out.println(in3==in4);//false
		System.out.println(in3.equals(in4));//true
		
	}
}
