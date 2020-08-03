package cn.xu.packclass;



/**
 * 测试自动装箱、自动拆箱
 * @author shen
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		Integer a=234;//自动装箱：Integer a=Integer.valueOf(234);
		int b=a;      //自动拆箱：int b=a.intValue();
		
		Integer c=null;
		if(c!=null) {
			int d=c;//自动拆箱:调用了 c.intValue();
		}
		
		//测试缓存[-128,127]之间的数字
		//在启动的时候就会自动生成[-128,127]的对象，
		//并把每个对象都放在IntegerCache.cache缓存区里面
		//每次装箱的时候判断若是在[-128,127]区间内的对象，就直接从缓存区取
		Integer in1=Integer.valueOf(-128);
		Integer in2=-128;
		System.out.println(in1==in2);//true
		System.out.println(in1.equals(in2));//true
		System.out.println("############");
		Integer in3=1234;
		Integer in4=1234;
		System.out.println(in3==in4);//false
		System.out.println(in3.equals(in4));//true
		
	}
}
