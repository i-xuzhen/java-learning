
/**
 * 用来测试注释的用法（包含：多行注释、单行注释，文档注释）
 * 以及标识符用法
 * 字符的使用
 * 布尔类型
 * @author shen
 *
 */
public class TestComment {
/**
 * 这是程序入口
 * @param args 参数
 */

	public static void main(String[] args) {
		System.out.println("测试注释！");
		int $a=1;
		int _a=1;
		int a=1;
		int $123=1;
		short salary=30000;
	//	char a='a';
		char b='b';
		//转义字符
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		//测试布尔类型
		boolean man=true;
		if(man) {
			System.out.println("男性");
		}
				
	}
}

