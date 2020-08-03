package cn.sxt.xu;

import cn.sxt.oo.User;//表示导入了User类
//import cn.sxt.oo.*;//表示导入oo下的所有的类，但是会降低编译速度，不会影响运行速度

import java.util.Date;//不同包里有了重名的类名
//import java.sql.Date;
import java.sql.*;

import static java.lang.Math.PI;//静态导入

public class Test {
	public static void main(String[] args) {
		//cn.sxt.oo.User user=new cn.sxt.oo.User();
		User user=new User();
		String str;
		
		//Date date= new Date();//这样就具有二异性，默认调用import时最详细的那个类
		//这个时候用最原始的方法调用就最好：
		java.util.Date date=new java.util.Date();
		
		//System.out.println(Math.PI);
		System.out.println(PI);
	}
}
