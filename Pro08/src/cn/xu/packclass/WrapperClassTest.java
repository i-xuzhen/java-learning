package cn.xu.packclass;
/**
 * 测试包装类
 * @author shen
 *
 */
public class WrapperClassTest {
	public static void main(String[] args) {
		//把基本数据类型转成包装类对象
		Integer a =new Integer(10);
		Integer b =Integer.valueOf(30);
		
		
		//把包装类对象转成基本数据类型
		int c= b.intValue();
		double d=b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e=new Integer("9999999");
		Integer f=Integer.parseInt("99997");
		
		Character g=new Character('d');
		Double dd=Double.valueOf(40);
		double dd1=dd.doubleValue();
		
		Double dd2=Double.parseDouble("1.032");
		
		//把包装类对象转成字符串
		String str=f.toString();//""+f
		
		//常见的常量
		System.out.println("int类型最大整数："+Integer.MAX_VALUE);
		
	}
}
