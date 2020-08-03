package cn.oo.array2;

import java.util.Arrays;

/**
 * ≤‚ ‘√∞≈›≈≈–Ú
 * @author shen
 *
 */
public class TestSortMao {
	public static void main(String[] args) {
		int[] values= {3,1,4,5,5,6,234,23,62,4};
		bubbleSort(values);
		//System.out.println(Arrays.toString(values));
	}
	
	public static void bubbleSort(int[] values) {
		int temp;
		for(int i=0;i<values.length-1;i++) {
			boolean flag=true;
			for(int j=0;j<values.length-1-i;j++) {
				if(values[j]<=values[j+1]) {
					temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
					flag=false;
				}
			System.out.println(Arrays.toString(values));
			}
			if(flag) {
				System.out.println("Ω· ¯");
				break;
			}
			System.out.println("######");
		}
	}
}
