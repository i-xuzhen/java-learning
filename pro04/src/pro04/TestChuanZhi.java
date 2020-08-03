package pro04;
/**
 * 方法中所有参数都是“值传递”，即传递的是值的副本。
 * 也就是说我们得到的是原参数的复印件，而不是原件
 * 因此，复印件改变不会影响原件
 * 但是若传递的是引用类型的话，传递是对象的地址。
 * 即副本和原参数都指向了同一个地址。改变副本指向对象的值也就改变了原参数对象指向的值
 * @author shen
 *
 */
public class TestChuanZhi {
	int id;
	String name;
	String pwd;
	
	public TestChuanZhi(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void testParameterTransfer01(TestChuanZhi u) {
		u.name="高小八";
	}
	public void testParameterTransfer02(TestChuanZhi u) {
		u = new TestChuanZhi(200,"高三");
	}
	
	public static void main(String[] args) {
		TestChuanZhi u1=new TestChuanZhi(101,"徐圳");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		//这里很重要！！！！
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);//从内存角度分析
		
	}
}
