package cn.oo.shuzu;
/**
 * 测试数组的三种初始化方式
 * @author shen
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//静态初始化
		int[] a= {1,2,65};
		System.out.println(a.length);
		User[] b= {
				new User(1001,"高清"),
				new User(1002,"徐圳"),
				new User(1003,"晓丽")
				};
		//动态初始化，直接通过下标赋值
		int[] a1=new int[3];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		//默认初始化
		int[] c=new int[3];//int 默认值为0；boolean 默认值为false;引用类型默认值为null
	}
}
