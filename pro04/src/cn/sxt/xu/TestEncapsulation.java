package cn.sxt.xu;
/**
 * 测试封装private default protected public
 * @author shen
 *
 */
import cn.sxt.oo.Human;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//h.name="徐圳";
		//name在cn.sxt.oo.Human类中定义的是默认状态
		//只能在同一个类或同一个包中使用
		
		Girl g=new Girl();
		g.fun();
		g.name="xx";
		g.fun();
	}
}

class Girl extends Human{
	int bb;
	void fun() {
		System.out.println(name);
	}
	
}
