package cn.oo.shuzu;
/**
 * ����String�ַ�����Ļ����÷�
 * @author shen
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str="abc";
		String str2=new String("def");
		String str3="abc"+"defg";
		String str4="18"+19;//���Ǽӷ����ַ����ӷ�
		System.out.println(str3);
		
		System.out.println("########");
		String str10="xuzhen";
		String str11="xuzhen";
		String str12=new String("xuzhen");
		System.out.println(str10==str11);
		System.out.println(str11==str12);//str11,str12����ͬһ������
		
		//��һ���ַ����Ƚ�ʹ��equals;
		
		System.out.println(str12.equals(str11));
		
	}
}
