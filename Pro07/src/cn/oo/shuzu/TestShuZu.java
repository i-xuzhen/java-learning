package cn.oo.shuzu;//arrays
/**
 * ������˳��
 * ����ȷ���ģ�����һ�������������Ĵ�С���ǲ��ɸı��
 * ����������������ͣ�����Ҳ���Կ����Ƕ��������е�ÿ��Ԫ���൱�ڸö���ĳ�Ա����
 * �����ʽ
 * type[] arr_name;
 * type arr_name[];
 * @author shen
 *
 */
public class TestShuZu {
	public static void main(String[] args) {
	//	int[] arr01;
	//	String[] arr02;
	//	User[] arr03;
	//######�������ֶ����ʽ������###����ʱֻ�����������飬��û��ʵ�����������JVM��ʱҲû�з���ռ�
	//	int arr01[];
	//	String arr02[];
	//	User arr03[];
		int arr01[]=new int[10];//�����±�0��1��2��3��4��5��6��7��8��9
		String arr02[]=new String[5];
		//����Ͷ���Ƕȷ���
		int[] s=null;//��ջ�ռ����������˱���s��������ʲô��û��
		s=new int[10];//�ڶ����濪���˶���ռ�
		//#######��������
		for(int i=0;i<arr01.length;i++) {
			arr01[i]=i*10;
		}
	//	for(int i=0;i<arr01.length;i++) {
	//		System.out.println(arr01[i]);
	//	}
		
		//foreachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
		for(int m :arr01) {
			System.out.println(m);
		}
		System.out.println("###########");
		User[] arr03=new User[3];
		arr03[0]=new User(1001,"����");
		arr03[1]=new User(1002,"����");
		arr03[2]=new User(1003,"����");
	//	for(int i=0;i<arr03.length;i++) {
	//		System.out.println(arr03[i].getId());
	//	}
		for(User m : arr03) {
			System.out.println(m.getId());
		}
		
	}  
}


