package cn.xu.Exception;
/**
 * �����쳣
 * �쳣���ࣺError,Exception
 * Error���ùܣ�Exception��Ϊ���ࣺRuntimeException��CheckedException
 * @author shen
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//����ʱ�쳣RuntimeException
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