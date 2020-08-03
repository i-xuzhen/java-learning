package cn.xu.contaniner;


import java.util.*;

/**
 * 测试Collection接口中的方法
 * @author shen
 *
 */
public class TestCollection {
	public static void main(String[] args) {
		
		test02();
	}
	
	
	public static void test01() {
		Collection<String> c=new ArrayList<>();
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("徐老大");
		c.add("徐老二");
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		System.out.println(c.contains("徐老1"));
		
		
		Object[] objs=c.toArray();
		System.out.println(objs);
		
		c.remove("徐老大");
		System.out.println(c);
		
		c.clear();
		System.out.println(c.size());
		
	}
	
	public static void test02() {
		List<String> list01=new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02=new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
		System.out.println("list02:"+list02);
		
//		System.out.println("##################");
//		
//		list01.addAll(list02);
//		System.out.println("list01:"+list01);
//		System.out.println("list02:"+list02);
		
//		System.out.println("##################");
//		
//		list01.removeAll(list02);
//		System.out.println("list01:"+list01);
//		System.out.println("list02:"+list02);
		
//		System.out.println("##################");
//		
//		list01.retainAll(list02);
//		System.out.println("list01:"+list01);
//		System.out.println("list02:"+list02);
		
		System.out.println(list01.containsAll(list02));
		
		
		
	}
	
	
}
