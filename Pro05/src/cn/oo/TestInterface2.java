package cn.oo;
/**
 * �ӿڵĶ�̳�
 * @author shen
 *
 */
public class TestInterface2 {

}

interface A{
	void testa();
}

interface B{
	void testb();
}

interface C extends A,B{
	void testc();
}

class MysubTest implements C{
	public void testa() {
		
	}
	public void testb() {
		
	}
	public void testc() {
		
	}
}