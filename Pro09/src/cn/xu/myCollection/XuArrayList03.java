package cn.xu.myCollection;

import java.util.Arrays;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * 增加数组扩容
 * @author shen
 *
 */
public class XuArrayList03<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY=10;
	
	public XuArrayList03() {
		elementData =new Object[DEFAULT_CAPACITY];
	}
	
	public XuArrayList03(int capacity) {
		elementData =new Object[capacity];
	}
	
	public void add (E obj) {
		//第一个问题，什么时候扩容
		if(size==elementData.length)
		//第二个问题，怎么扩容
		{
			Object[] newArray=new Object[elementData.length+(elementData.length>>1)];
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData=newArray;
		}
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
		XuArrayList03<String> x1=new XuArrayList03<String>();
		
		for(int i=0;i<30;i++) {
			x1.add("XU"+i);
		}
//		x1.add("aa");
//		x1.add("bb");
		System.out.println(x1);
		
	}
	
	
	
}
