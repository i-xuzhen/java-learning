package cn.xu.myCollection;

import java.util.Arrays;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * @author shen
 *
 */
public class XuArrayList01 {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY=10;
	
	public XuArrayList01() {
		elementData =new Object[DEFAULT_CAPACITY];
	}
	
	public XuArrayList01(int capacity) {
		elementData =new Object[capacity];
	}
	
	public void add (Object obj) {
		elementData[size++]=obj;
	}

	@Override
	public String toString() {
		//return "XuArrayList [elementData=" + Arrays.toString(elementData) + ", size=" + size + "]";
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}

	public static void main(String[] args) {
		XuArrayList01 x1=new XuArrayList01();
		
		x1.add("aa");
		x1.add("bb");
		System.out.println(x1);
		
	}
	
	
	
}
