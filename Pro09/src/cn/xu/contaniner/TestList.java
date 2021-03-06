package cn.xu.contaniner;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试Collection的子接口List下的实现类：
 * ArrayList(底层是数组) ：查询效率高，增删效率低，线程不安全，但通常使用
 * Vector(底层是数组) ：线程安全
 * LinkedList(底层是链表)：增删效率高
 * @author shen
 *
 */
public class TestList {
	public static void main(String[] args) {
		test01();
		//ArrayList list;
		
	}
	
	
	public static void test01() {
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");	
		list.add("C");	
		list.add("D");	
		System.out.println(list);
		
		list.add(2, "我");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(2, "徐");
		System.out.println(list);
		
		//System.out.println(list.get(2));
		
		//System.out.println(list.indexOf("0"));
		
		list.add("E");
		list.add("F");
		list.add("A");
		System.out.println(list);
		System.out.println(list.indexOf("A"));
		System.out.println(list.lastIndexOf("A"));	
	}
	
}

