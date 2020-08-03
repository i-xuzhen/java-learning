package cn.oo.array2;
/**
 * 测试java.util.Arrays工具类的使用
 * @author shen
 *
 */
import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] a= {100,20,350,30,10};
		System.out.println(Arrays.toString(a));//帮助我们打印指定数组内容
		Arrays.sort(a);//排序
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 30));//搜索
	}
}
