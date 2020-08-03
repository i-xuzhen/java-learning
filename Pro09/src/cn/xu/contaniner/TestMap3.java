package cn.xu.contaniner;

import java.util.HashMap;

/*
 * 测试HashMap底层
 * 理解底层如何使用哈希表，一种非常重要的数据结构
 * 将hash码和hash值区别开来
 * 
 * java中两个内容相同(equals()为true)的对象必须具有相等的hashcode
 * 
 * HashMap在存储一个元素时，当对应链表长度大于8时，
 * 链表就转换为红黑树，这样又大大提高了查找的效率。
 * 
 */
public class TestMap3 {
	
	public static void main(String[] args) {
		HashMap h1;
		String s1="徐圳";
		String s2="徐圳";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
