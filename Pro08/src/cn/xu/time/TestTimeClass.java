package cn.xu.time;
/**
 * 测试时间类 Date类
 * 1970年1月1日00：00：00定为基准时间
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
		
		
		//以后使用日期时间使用DateFormat 和Calendar类
		long now =System.currentTimeMillis();
		System.out.println(now);
	}
}
