package cn.xu.packclass;
/**
 * ���԰�װ��
 * @author shen
 *
 */
public class WrapperClassTest {
	public static void main(String[] args) {
		//�ѻ�����������ת�ɰ�װ�����
		Integer a =new Integer(10);
		Integer b =Integer.valueOf(30);
		
		
		//�Ѱ�װ�����ת�ɻ�����������
		int c= b.intValue();
		double d=b.doubleValue();
		
		//���ַ���ת�ɰ�װ�����
		Integer e=new Integer("9999999");
		Integer f=Integer.parseInt("99997");
		
		Character g=new Character('d');
		Double dd=Double.valueOf(40);
		double dd1=dd.doubleValue();
		
		Double dd2=Double.parseDouble("1.032");
		
		//�Ѱ�װ�����ת���ַ���
		String str=f.toString();//""+f
		
		//�����ĳ���
		System.out.println("int�������������"+Integer.MAX_VALUE);
		
	}
}
