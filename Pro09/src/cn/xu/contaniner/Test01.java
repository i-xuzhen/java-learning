package cn.xu.contaniner;
/**
 * ��������
 * ����ⷺ�ͣ�
 * @author shen
 *
 */
public class Test01 {
	public static void main(String[] args) {
		
		MyCollection<String> mc=new MyCollection<String>();
		
		
		mc.set("����", 0);
		mc.set("8888", 1);
		mc.set("֣����", 2);
		
		String b=mc.get(0);
		System.out.println(b);
		
	}
}

//<T,E,V>һ������������ĸ
class MyCollection<E>{
	Object[] objs=new Object[5];
	public void set(E e,int index) {
		objs[index]=e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
}