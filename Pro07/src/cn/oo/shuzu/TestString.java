package cn.oo.shuzu;
/**
 * 测试String字符串类的基本用法
 * @author shen
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str="abc";
		String str2=new String("def");
		String str3="abc"+"defg";
		String str4="18"+19;//不是加法是字符连接符
		System.out.println(str3);
		
		System.out.println("########");
		String str10="xuzhen";
		String str11="xuzhen";
		String str12=new String("xuzhen");
		System.out.println(str10==str11);
		System.out.println(str11==str12);//str11,str12不是同一个对象
		
		//故一般字符串比较使用equals;
		
		System.out.println(str12.equals(str11));
		
	}
}
