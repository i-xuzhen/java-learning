package cn.oo.array2;
/**
 * ����java.util.Arrays�������ʹ��
 * @author shen
 *
 */
import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] a= {100,20,350,30,10};
		System.out.println(Arrays.toString(a));//�������Ǵ�ӡָ����������
		Arrays.sort(a);//����
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 30));//����
	}
}
