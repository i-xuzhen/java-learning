package cn.xu.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮��Ļ���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author shen
 *
 */
public class ParseException {
	public static void main(String[] args) throws java.text.ParseException {
		
		//�����ƶ��ĸ�ʽת���ַ���
		DateFormat df=new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");//Ctrl+Shift+O�Զ�������صİ�
		String str=df.format(new Date(400000));
		System.out.println(str);
		
		//���ַ�������"��ʽ�ַ���ָ���ĸ�ʽ"ת����Ӧ��ʱ�����
		DateFormat df2=new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date date=df2.parse("1983��05��10�� 10ʱ45��59��");
		System.out.println(date);
		
		//���������ĸ�ʽ�ַ�
		DateFormat df3=new SimpleDateFormat("D");//Ctrl+Shift+O�Զ�������صİ�
		String str3=df3.format(new Date());
		System.out.println(str3);
		
		
	}
}
