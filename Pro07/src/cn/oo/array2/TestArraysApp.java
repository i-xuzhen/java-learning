package cn.oo.array2;

import java.util.Arrays;

/**
 * ��������Ӧ��
 * @author shen
 *
 */
public class TestArraysApp {
	
	public static void main(String[] args) {
		Object[] emp1= {1001,"����",18,"����","2014.10"};
		Object[] emp2= {1003,"����",20,"��ѧ","2016.10"};
		Object[] emp3= {1003,"����",25,"�о���","2021.10"};
		
		Object[][] tableData=new Object[3][];
		tableData[0]=emp1;
		tableData[1]=emp2;
		tableData[2]=emp3;
		for(Object[] temp:tableData) {
			System.out.println(Arrays.toString(temp));
		}
		
	}

	
	
	
}
