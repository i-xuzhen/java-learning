package cn.xu.time;
/**
 * ����ʱ���� Date��
 * 1970��1��1��00��00��00��Ϊ��׼ʱ��
 * @author shen
 *
 */

import java.util.Date;

public class TestTimeClass {
	public static void main(String[] args) {
		
		Date d=new Date(2000);
		System.out.println(d);
		
		Date d1=new Date();
		System.out.println(d1.after(d));
		System.out.println(d1.before(d));
		System.out.println(d1.equals(d));
		System.out.println(d1.getTime());
		System.out.println(d1.toString());
		
		
		//�Ժ�ʹ������ʱ��ʹ��DateFormat ��Calendar��
		long now =System.currentTimeMillis();
		System.out.println(now);
	}
}
