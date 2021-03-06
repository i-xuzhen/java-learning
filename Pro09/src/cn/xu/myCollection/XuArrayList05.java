package cn.xu.myCollection;

import java.util.Arrays;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * 增加删除remove方法
 * @author shen
 *
 */
public class XuArrayList05<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY=10;
	
	public XuArrayList05() {
		elementData =new Object[DEFAULT_CAPACITY];
	}
	
	public XuArrayList05(int capacity) {
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
	
	//增加移除功能
	public void remove(E element) {
		//element，将它和所有元素挨个比较，获得一个比较为ture返回
		for(int i=0;i<size;i++) {
			if(element.equals(get(i))) {//容器中所有的比较操作都是用的equals而不是==
			//将该元素从此除移除
				remove(i);
			}
		}
		
	}
	
	public void remove(int index) {
//		checkRang(index);
		int numMoved=elementData.length-index-1;
		if(numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
			elementData[--size]=null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}else
			return false;
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
		XuArrayList05<String> x1=new XuArrayList05<String>();
		
		for(int i=0;i<30;i++) {
			x1.add("XU"+i);
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		
		
		System.out.println(x1.get(10));
		x1.set("ddddd",10);
		System.out.println(x1);
		x1.remove(3);
		System.out.println(x1);
		x1.remove("XU0");
		System.out.println(x1);
		System.out.println(x1.size());
		System.out.println(x1.isEmpty());
	}
	
	
	
}
