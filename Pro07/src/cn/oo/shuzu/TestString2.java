package cn.oo.shuzu;
/**
 * 测试字符串的常用方法
 * @author shen
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		
//		  String s1="core Java"; String s2="Core Java";
//		  System.out.println(s1.charAt(3));
//		  
//		  System.out.println(s2.length());
//		  
//		  System.out.println(s1.equals(s2));//从内容角度判断字符串是否相等
//		  
//		  System.out.println(s1.equalsIgnoreCase(s2));//从内容角度判断字符串是否相等不分大小写
//		  
//		  System.out.println(s1.indexOf("Java"));//“”返回中的第一个字母从从哪里开始
//		  System.out.println(s1.indexOf("apple"));
//		  
//		  
//		  String s3=s1.replace(' ', '&'); System.out.println("result is :"+s3);
		 
		
		String s="";
		String s1="How are you?";
//		System.out.println(s1.startsWith("Ho"));//是否以Ho开始
//		System.out.println(s1.endsWith("ou?"));//是否以ou?结束
		
//		s=s1.substring(4);//从4开始到后面
//		System.out.println(s);
//		s=s1.substring(4, 7);//4开始，不包括7
//		System.out.println(s);
		
		s=s1.toLowerCase();//转小写
		System.out.println(s);
		s=s1.toUpperCase();//转大写
		System.out.println(s);
		
		String s2="  How old are you!!  ";
		s=s2.trim();//去除字符串前后空格，中间的不去
		System.out.println(s);
		System.out.println(s2);
	}
}
