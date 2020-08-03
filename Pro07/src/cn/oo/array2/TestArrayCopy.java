package cn.oo.array2;
/**
 * 测试数组的拷贝
 * @author shen
 *
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		//testBasicCopy();
		System.out.println("#######");
		//testDelete();
		String[] str1= {"aa","bb","cc","dd","ee","ff"};
		//删除测试单个
//		testDelete(str1,0);
//		for(int i=0;i<str1.length;i++) {
//			System.out.println(i+"-->"+str1[i]);
//		}
		//扩容测试
//		 str1=extendRange(str1,100);
//		for(int i=0;i<str1.length;i++) {
//		System.out.println(i+"-->"+str1[i]);
//	}
		//删除测试多个
//		testDelete(str1,4,5);
//		for(int i=0;i<str1.length;i++) {
//			System.out.println(i+"-->"+str1[i]);
//		}
		//测试插入数组
		String[]str2= {"11"};
		str1=addArray(str1,str2,4);
		for(int i=0;i<str1.length;i++) {
		System.out.println(i+"-->"+str1[i]);
	}
	}
	
	public static void testBasicCopy() {
		String[] s1= {"aa","bb","cc","dd","ee"};
		String[] s2=new String[10];
		for(int i=0;i<s2.length;i++) {
			s2[i]="ooooo";
		}
		System.arraycopy(s1, 2, s2, 5, 3);
		for(String n:s2) {
			System.out.println(n);
		}
	}
	//通过拷贝来实现删除数组的的效果                                                                                                                                                                                                                                                              
	public static String[] testDelete(String[] s,int index) {
//		String[] s1= {"aa","bb","cc","dd","ee"};
//		String[] s2=new String[5];

//		System.arraycopy(s1, 0, s2, 0, 2);
//		System.arraycopy(s1, 3, s2, 3, 2);
		System.arraycopy(s, index+1, s, index, s.length-1-index);
		s[s.length-1]=null;
		return s;
	}
	public static String[] testDelete(String[] s,int index1,int index2) {
		for(int a=index1;a<=index2;a++) {
			System.arraycopy(s, index1+1, s, index1, s.length-1-index1);
			s[s.length-1]=null;
		}

		return s;
	}
	
	//数组的扩容（本质上是：先定义一个更大的数组，然后将原数组原封不动的拷贝到新数组中）
	public static String[] extendRange(String[] u,int number) {
		String[] str1=new String[number];
		System.arraycopy(u, 0, str1, 0, u.length);
		return str1;
	}
	
	//测试插入数组
	public static String[] addArray(String[] src_u1,String[] add_u2,int index) {
		String[] str1=new String[src_u1.length+add_u2.length];
		System.arraycopy(src_u1, 0, str1, 0, index+1);
		System.arraycopy(add_u2, 0, str1, index+1, add_u2.length);
		System.arraycopy(src_u1, index+1, str1, index+add_u2.length+1, src_u1.length-index-1);
		return str1;
	}
	
	
	
	
	
}
