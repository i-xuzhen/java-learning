package cn.oo.array2;

import java.util.Arrays;

/**
 * 测试数组应用
 * @author shen
 *
 */
public class TestArraysApp {
	
	public static void main(String[] args) {
		Object[] emp1= {1001,"徐圳",18,"高中","2014.10"};
		Object[] emp2= {1003,"徐圳",20,"大学","2016.10"};
		Object[] emp3= {1003,"徐圳",25,"研究生","2021.10"};
		
		Object[][] tableData=new Object[3][];
		tableData[0]=emp1;
		tableData[1]=emp2;
		tableData[2]=emp3;
		for(Object[] temp:tableData) {
			System.out.println(Arrays.toString(temp));
		}
		
	}

	
	
	
}
