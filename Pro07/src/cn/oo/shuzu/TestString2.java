package cn.oo.shuzu;
/**
 * �����ַ����ĳ��÷���
 * @author shen
 *
 */
public class TestString2 {
	public static void main(String[] args) {
		
//		  String s1="core Java"; String s2="Core Java";
//		  System.out.println(s1.charAt(3));
//		  
//		  System.out.println(s2.length());
//		  
//		  System.out.println(s1.equals(s2));//�����ݽǶ��ж��ַ����Ƿ����
//		  
//		  System.out.println(s1.equalsIgnoreCase(s2));//�����ݽǶ��ж��ַ����Ƿ���Ȳ��ִ�Сд
//		  
//		  System.out.println(s1.indexOf("Java"));//���������еĵ�һ����ĸ�Ӵ����￪ʼ
//		  System.out.println(s1.indexOf("apple"));
//		  
//		  
//		  String s3=s1.replace(' ', '&'); System.out.println("result is :"+s3);
		 
		
		String s="";
		String s1="How are you?";
//		System.out.println(s1.startsWith("Ho"));//�Ƿ���Ho��ʼ
//		System.out.println(s1.endsWith("ou?"));//�Ƿ���ou?����
		
//		s=s1.substring(4);//��4��ʼ������
//		System.out.println(s);
//		s=s1.substring(4, 7);//4��ʼ��������7
//		System.out.println(s);
		
		s=s1.toLowerCase();//תСд
		System.out.println(s);
		s=s1.toUpperCase();//ת��д
		System.out.println(s);
		
		String s2="  How old are you!!  ";
		s=s2.trim();//ȥ���ַ���ǰ��ո��м�Ĳ�ȥ
		System.out.println(s);
		System.out.println(s2);
	}
}
