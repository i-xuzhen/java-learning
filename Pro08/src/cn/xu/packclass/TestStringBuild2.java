package cn.xu.packclass;
/**
 * 测试stringbuilder//可以变字符序列的常用方法
 *  stringbuffer
 * @author shen
 *
 */
public class TestStringBuild2 {
	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			sb.append((char)('a'+i));//append:在后面追加,如sb指向"abc",sb.append(d),则结果为"abcd";
		}
		System.out.println(sb);
		
		sb.reverse();//让可以变字符序列StringBuilder倒转
		System.out.println(sb);
		sb.setCharAt(3, '高');
		System.out.println(sb);
		sb.insert(1, '我');//在索引1的前面插入
		//insert返回值是自己，故可以链式调用如下：
		sb.insert(4, '爱').insert(5, '你').insert(6, '吗');
		System.out.println(sb);
		
		//注意看源码，如果返回值为this就可以进行链式调用
		sb.delete(20, 23);//左闭右开
		System.out.println(sb);
		
	}
}
