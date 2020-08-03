package cn.xu.packclass;
/**
 * 测试String 类
 * @author shen
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str="aaaabbb";
		String str2=str.substring(1,4);
		
		System.out.println(str.charAt(2));
		String str3="aaaabbb";
		
		System.out.println(str==str3);//常量池，比较的是引用
		System.out.println(str2);
		
//        //编译器做了优化,直接在编译的时候将字符串进行拼接
//        String str1 = "hello" + " java";//相当于str1 = "hello java";
//        String str2 = "hello java";
//        System.out.println(str1 == str2);//true
//        String str3 = "hello";
//        String str4 = " java";
//        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
//        String str5 = str3 + str4;
//        System.out.println(str2 == str5);//false
//        
//        //比较字符串还是用equals;
//        System.out.println(str2.equals(str5));//比较的是内容大小
		
		
	
	}

	

}
