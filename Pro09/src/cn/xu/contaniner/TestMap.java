package cn.xu.contaniner;

import java.util.HashMap;
import java.util.Map;

/*
 * 测试HashMap
 * 键不能重复！！
 * 
 */
public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<>();
				
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsValue("one"));
		System.out.println(m1.containsKey(1));
		
		Map<Integer,String> m2=new HashMap<>();
		
		m2.put(4, "four");
		//map中键不能重复!  如果重复，则新的覆盖！
		//map中键重复的判断是用equals判断。
		m2.put(5, "five");
		m2.put(5, "五");
		System.out.println(m2.get(5));
		
		m1.putAll(m2);
		
		System.out.println(m1);
		
		
		
	}
	
	
}
