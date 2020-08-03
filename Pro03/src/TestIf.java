/**
 * 测试If
 * @author shen
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double d =Math.random();//返回【0，1】的随机数
		System.out.println(d);
		int d1 =(int)(6*Math.random()+1);
		int d2 =(int)(6*Math.random()+1);
		int d3 =(int)(6*Math.random()+1);
		int count=d1+d2+d3;
		if(count>=15) {
			System.out.println("手气不错！");
		}
		if (count>=7 && count<15) {
			System.out.println("手气一般！");
		}
		if (count<7) {
			System.out.println("手气太差了！");
		}
		System.out.println(count);
	}
}
