package pro04;
/**
 * ���������в������ǡ�ֵ���ݡ��������ݵ���ֵ�ĸ�����
 * Ҳ����˵���ǵõ�����ԭ�����ĸ�ӡ����������ԭ��
 * ��ˣ���ӡ���ı䲻��Ӱ��ԭ��
 * ���������ݵ����������͵Ļ��������Ƕ���ĵ�ַ��
 * ��������ԭ������ָ����ͬһ����ַ���ı丱��ָ������ֵҲ�͸ı���ԭ��������ָ���ֵ
 * @author shen
 *
 */
public class TestChuanZhi {
	int id;
	String name;
	String pwd;
	
	public TestChuanZhi(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void testParameterTransfer01(TestChuanZhi u) {
		u.name="��С��";
	}
	public void testParameterTransfer02(TestChuanZhi u) {
		u = new TestChuanZhi(200,"����");
	}
	
	public static void main(String[] args) {
		TestChuanZhi u1=new TestChuanZhi(101,"����");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		//�������Ҫ��������
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);//���ڴ�Ƕȷ���
		
	}
}
