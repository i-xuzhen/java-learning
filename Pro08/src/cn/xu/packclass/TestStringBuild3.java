package cn.xu.packclass;
/**
 * ���Կɱ��ַ����кͲ��ɱ��ַ�����ʹ�õ�����
 * @author shen
 *
 */
public class TestStringBuild3 {
	public static void main(String[] args) {
		
		//ԭʼ����
		String str8="";
		
		long num1=Runtime.getRuntime().freeMemory();
		long time1=System.currentTimeMillis();
		
		for(int i=0;i<5000;i++) {
			str8=str8+i;//�൱�ڲ�����10000������,Ч�ʼ��ͣ������ڴ棬��ɣ�
		}
		
		long num2=Runtime.getRuntime().freeMemory();
		long time2=System.currentTimeMillis();
		System.out.println("Stringռ�õ��ڴ棺"+(num1-num2));
		System.out.println("Stringռ�õ�ʱ�䣺"+(time2-time1));
		System.out.println(str8);
		//�Ľ�����
		
		StringBuilder sb1=new StringBuilder("");
		
		long num3=Runtime.getRuntime().freeMemory();
		long time3=System.currentTimeMillis();
		
		for(int i=0;i<5000;i++) {
			sb1.append(i);//����ҪƵ���������󣬽�ʡ�ռ䣬Ч�ʸ�
		}
		long num4=Runtime.getRuntime().freeMemory();
		long time4=System.currentTimeMillis();
		System.out.println("StringBuilderռ�õ��ڴ棺"+(num3-num4));
		System.out.println("StrignBuilderռ�õ�ʱ�䣺"+(time4-time3));
		System.out.println(sb1);
	

		
	}
}
