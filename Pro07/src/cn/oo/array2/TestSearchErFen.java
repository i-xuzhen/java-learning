package cn.oo.array2;

import java.util.Arrays;

/**
 * ²âÊÔ¶þ·Ö·¨£»
 * @author shen
 *
 */
public class TestSearchErFen {
	public static void main(String[] args) {
		int[] str= {7,8,9,10,12,20,30,40,50,80,100};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		System.out.println(binarySearch(str,8));
	}
	
	public static int binarySearch(int[] array,int value) {
		int low=0;
		int high=array.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(value==array[mid]) {
				return mid;
			}
			if(value>array[mid]) {
				low=mid+1;
			}
			if(value<array[mid]) {
				high=mid-1;
			}			
		}
		return -1;
	}
	
	
}
