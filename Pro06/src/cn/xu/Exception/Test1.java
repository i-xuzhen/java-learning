package cn.xu.Exception;
/**
 * 测试异常
 * 异常分类：Error,Exception
 * Error不用管，Exception分为两类：RuntimeException和CheckedException
 * @author shen
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//运行时异常RuntimeException
//		int a=0;
//		int b=1;
//		if(a!=0) {
//			System.out.println(b/a);
//		}
		String str=null;
		if(str!=null) {
			System.out.print(str.charAt(0));
		}
		
		 Animal d=new Dog();
		 if(d instanceof Cat) {
			 Cat c=(Cat)d;
		 }
	     
		
		
	}
}

class Animal{
    
}
class Dog extends Animal{
     
}
class Cat extends Animal{
     
}