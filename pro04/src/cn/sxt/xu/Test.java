package cn.sxt.xu;

import cn.sxt.oo.User;//��ʾ������User��
//import cn.sxt.oo.*;//��ʾ����oo�µ����е��࣬���ǻή�ͱ����ٶȣ�����Ӱ�������ٶ�

import java.util.Date;//��ͬ������������������
//import java.sql.Date;
import java.sql.*;

import static java.lang.Math.PI;//��̬����

public class Test {
	public static void main(String[] args) {
		//cn.sxt.oo.User user=new cn.sxt.oo.User();
		User user=new User();
		String str;
		
		//Date date= new Date();//�����;��ж����ԣ�Ĭ�ϵ���importʱ����ϸ���Ǹ���
		//���ʱ������ԭʼ�ķ������þ���ã�
		java.util.Date date=new java.util.Date();
		
		//System.out.println(Math.PI);
		System.out.println(PI);
	}
}
