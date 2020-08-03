package cn.oo.shuzu;//arrays
/**
 * 数组有顺序
 * 长度确定的，数组一旦被创建，它的大小就是不可改变的
 * 数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
 * 定义格式
 * type[] arr_name;
 * type arr_name[];
 * @author shen
 *
 */
public class TestShuZu {
	public static void main(String[] args) {
	//	int[] arr01;
	//	String[] arr02;
	//	User[] arr03;
	//######上下两种定义格式都可以###但此时只是声明了数组，并没有实例化数组对象，JVM此时也没有分配空间
	//	int arr01[];
	//	String arr02[];
	//	User arr03[];
		int arr01[]=new int[10];//索引下标0，1，2，3，4，5，6，7，8，9
		String arr02[]=new String[5];
		//从类和对象角度分析
		int[] s=null;//在栈空间里面声明了变量s，堆里面什么都没有
		s=new int[10];//在堆里面开辟了对象空间
		//#######遍历数组
		for(int i=0;i<arr01.length;i++) {
			arr01[i]=i*10;
		}
	//	for(int i=0;i<arr01.length;i++) {
	//		System.out.println(arr01[i]);
	//	}
		
		//foreach循环：用于读取数组元素的值，不能修改元素的值
		for(int m :arr01) {
			System.out.println(m);
		}
		System.out.println("###########");
		User[] arr03=new User[3];
		arr03[0]=new User(1001,"徐圳");
		arr03[1]=new User(1002,"徐圳");
		arr03[2]=new User(1003,"徐圳");
	//	for(int i=0;i<arr03.length;i++) {
	//		System.out.println(arr03[i].getId());
	//	}
		for(User m : arr03) {
			System.out.println(m.getId());
		}
		
	}  
}


