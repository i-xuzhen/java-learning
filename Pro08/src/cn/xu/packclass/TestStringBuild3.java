package cn.xu.packclass;
/**
 * 测试可变字符序列和不可变字符序列使用的陷阱
 * @author shen
 *
 */
public class TestStringBuild3 {
	public static void main(String[] args) {
		
		//原始方法
		String str8="";
		
		long num1=Runtime.getRuntime().freeMemory();
		long time1=System.currentTimeMillis();
		
		for(int i=0;i<5000;i++) {
			str8=str8+i;//相当于产生了10000个对象,效率极低，消耗内存，大忌！
		}
		
		long num2=Runtime.getRuntime().freeMemory();
		long time2=System.currentTimeMillis();
		System.out.println("String占用的内存："+(num1-num2));
		System.out.println("String占用的时间："+(time2-time1));
		System.out.println(str8);
		//改进方法
		
		StringBuilder sb1=new StringBuilder("");
		
		long num3=Runtime.getRuntime().freeMemory();
		long time3=System.currentTimeMillis();
		
		for(int i=0;i<5000;i++) {
			sb1.append(i);//不需要频繁创建对象，节省空间，效率高
		}
		long num4=Runtime.getRuntime().freeMemory();
		long time4=System.currentTimeMillis();
		System.out.println("StringBuilder占用的内存："+(num3-num4));
		System.out.println("StrignBuilder占用的时间："+(time4-time3));
		System.out.println(sb1);
	

		
	}
}
