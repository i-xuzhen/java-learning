package cn.xu.packclass;
/**
 * ����stringbuilder//���Ա��ַ����еĳ��÷���
 *  stringbuffer
 * @author shen
 *
 */
public class TestStringBuild2 {
	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			sb.append((char)('a'+i));//append:�ں���׷��,��sbָ��"abc",sb.append(d),����Ϊ"abcd";
		}
		System.out.println(sb);
		
		sb.reverse();//�ÿ��Ա��ַ�����StringBuilder��ת
		System.out.println(sb);
		sb.setCharAt(3, '��');
		System.out.println(sb);
		sb.insert(1, '��');//������1��ǰ�����
		//insert����ֵ���Լ����ʿ�����ʽ�������£�
		sb.insert(4, '��').insert(5, '��').insert(6, '��');
		System.out.println(sb);
		
		//ע�⿴Դ�룬�������ֵΪthis�Ϳ��Խ�����ʽ����
		sb.delete(20, 23);//����ҿ�
		System.out.println(sb);
		
	}
}
