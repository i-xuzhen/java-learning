package cn.xu.packclass;
/**
 * ����stringbuild stringbuffer
 * @author shen
 *
 */
public class TestStringBuild {
	public static void main(String[] args) {
		String str;
		
		//StringBuilder �̲߳���ȫ��Ч�ʸߣ�һ��ʹ��������
		//StringBuffer �̰߳�ȫ��Ч�ʵ�
		StringBuilder sb=new StringBuilder("abcdefg");
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		//String���ɱ��ַ����������޸ģ�ֻ����System.arraycopy�����ݻ��޸�
		sb.setCharAt(2, 'M');//��StringBuilder�Ϳ��Ե����޸ģ�
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		
	}
}
