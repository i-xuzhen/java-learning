package cn.xu.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * �����������ʹ��
 * @author shen
 *
 */
public class TestCanlendar {
	public static void main(String[] args) {
		//�������
		Calendar calendar =new GregorianCalendar(2999,10,19,22,10,50);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DATE);
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);//0-11��ʾ��Ӧ���·ݣ�0��1��
		System.out.println(day);
		System.out.println(weekday);//���ڼ���1-7��1�������գ�2����һ��7��������
		System.out.println(calendar);
		//��������
		Calendar c2= new GregorianCalendar();
		c2.set(c2.YEAR, 8012);//�������Ϊ8012
		System.out.println(c2);
		
		//���ڵļ���
		Calendar c3= new GregorianCalendar();
		c3.add(c2.DATE, 100);//����100��
		System.out.println(c3);
		
		//���ڶ����ʱ������ת��
		Date d4=c3.getTime();
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		
		
	}
}
