package cn.xu.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类的使用
 * @author shen
 *
 */
public class TestCanlendar {
	public static void main(String[] args) {
		//获得日期
		Calendar calendar =new GregorianCalendar(2999,10,19,22,10,50);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DATE);
		int weekday=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);//0-11表示对应的月份，0是1月
		System.out.println(day);
		System.out.println(weekday);//星期几：1-7，1：星期日，2星期一，7是星期六
		System.out.println(calendar);
		//设置日期
		Calendar c2= new GregorianCalendar();
		c2.set(c2.YEAR, 8012);//设置年份为8012
		System.out.println(c2);
		
		//日期的计算
		Calendar c3= new GregorianCalendar();
		c3.add(c2.DATE, 100);//往后100天
		System.out.println(c3);
		
		//日期对象和时间对象的转化
		Date d4=c3.getTime();
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		
		
	}
}
