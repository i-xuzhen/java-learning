package cn.xu.contaniner;

import java.util.ArrayList;
import java.util.List;

/**
 * ����Collection���ӽӿ�List�µ�ʵ���ࣺ
 * ArrayList(�ײ�������) ����ѯЧ�ʸߣ���ɾЧ�ʵͣ��̲߳���ȫ����ͨ��ʹ��
 * Vector(�ײ�������) ���̰߳�ȫ
 * LinkedList(�ײ�������)����ɾЧ�ʸ�
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
		
		list.add(2, "��");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.set(2, "��");
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
