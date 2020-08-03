package cn.oo.array2;
/**
 * 测试多维数组
 * @author shen
 *
 */
public class TestDoubleArrays {
	public static void main(String[] args) {
//		int[] a=new int[3];
//		Car[] cars =new Car[3];		
		
		int[][] a=new int[3][];
		a[0]=new int[] {10,20,30};
		a[1]=new int[] {50,60,40};
		a[2]=new int[] {1,23,45};
		System.out.println(a[1][2]);
		//纯静态初始化二维数组
		int[][] b= {
				{20,30,40},
				{50,30,10},
				{10,3,99}
		};
		System.out.println(b[1][2]);
		
		
	}
	
}


class Car{
	
}