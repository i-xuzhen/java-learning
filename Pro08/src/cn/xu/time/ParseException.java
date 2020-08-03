package cn.xu.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的互相转换
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @author shen
 *
 */
public class ParseException {
	public static void main(String[] args) throws java.text.ParseException {
		
		//按照制定的格式转成字符串
		DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");//Ctrl+Shift+O自动导入相关的包
		String str=df.format(new Date(400000));
		System.out.println(str);
		
		//把字符串按照"格式字符串指定的格式"转成相应的时间对象
		DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date date=df2.parse("1983年05月10日 10时45分59秒");
		System.out.println(date);
		
		//测试其他的格式字符
		DateFormat df3=new SimpleDateFormat("D");//Ctrl+Shift+O自动导入相关的包
		String str3=df3.format(new Date());
		System.out.println(str3);
		
		
	}
}
