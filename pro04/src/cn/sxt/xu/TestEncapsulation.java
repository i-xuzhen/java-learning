package cn.sxt.xu;
/**
 * ���Է�װprivate default protected public
 * @author shen
 *
 */
import cn.sxt.oo.Human;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//h.name="����";
		//name��cn.sxt.oo.Human���ж������Ĭ��״̬
		//ֻ����ͬһ�����ͬһ������ʹ��
		
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
