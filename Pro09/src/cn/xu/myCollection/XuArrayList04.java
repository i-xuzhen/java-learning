package cn.xu.myCollection;

import java.util.Arrays;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * 增加set和get方法
 * 增加数组边界的检查
 * @author shen
 *
 */
public class XuArrayList04<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY=10;
	
	public XuArrayList04() {
		elementData =new Object[DEFAULT_CAPACITY];
	}
	
	public XuArrayList04(int capacity) {
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
	
	public E get(int index) {
		checkRang(index);//判断索引是否异常
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
		checkRang(index);//判断索引是否异常
		elementData[index]=element;
	}
	
	//判断索引是否异常
	public void checkRang(int index) {
		//优先判断索引是否合法，size=10--->索引为[0,9)
		if(index<0||index>size-1) {
		//不合法
		throw new RuntimeException("索引不合法："+index);
		}
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
		XuArrayList04<String> x1=new XuArrayList04<String>();
		
		for(int i=0;i<30;i++) {
			x1.add("XU"+i);
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		
		
		System.out.println(x1.get(10));
		x1.set("ddddd",10);
		System.out.println(x1);
		
	}
	
	
	
}
