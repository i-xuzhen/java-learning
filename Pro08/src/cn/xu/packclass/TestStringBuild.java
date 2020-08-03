package cn.xu.packclass;
/**
 * 测试stringbuild stringbuffer
 * @author shen
 *
 */
public class TestStringBuild {
	public static void main(String[] args) {
		String str;
		
		//StringBuilder 线程不安全，效率高（一般使用它），
		//StringBuffer 线程安全，效率低
		StringBuilder sb=new StringBuilder("abcdefg");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		//String不可变字符串，不能修改，只能用System.arraycopy来扩容或修改
		sb.setCharAt(2, 'M');//但StringBuilder就可以单独修改！
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		
	}
}
