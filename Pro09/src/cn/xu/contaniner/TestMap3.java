package cn.xu.contaniner;

import java.util.HashMap;

/*
 * ����HashMap�ײ�
 * ����ײ����ʹ�ù�ϣ����һ�ַǳ���Ҫ�����ݽṹ
 * ��hash���hashֵ������
 * 
 * java������������ͬ(equals()Ϊtrue)�Ķ�����������ȵ�hashcode
 * 
 * HashMap�ڴ洢һ��Ԫ��ʱ������Ӧ�������ȴ���8ʱ��
 * ������ת��Ϊ������������ִ������˲��ҵ�Ч�ʡ�
 * 
 */
public class TestMap3 {
	
	public static void main(String[] args) {
		HashMap h1;
		String s1="����";
		String s2="����";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}