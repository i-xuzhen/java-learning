package cn.xu.myCollection;

import java.util.Arrays;

/**
 * �Զ���ʵ��һ��ArrayList,���ײ�ԭ��
 * ����set��get����
 * ��������߽�ļ��
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
		//��һ�����⣬ʲôʱ������
		if(size==elementData.length)
		//�ڶ������⣬��ô����
		{
			Object[] newArray=new Object[elementData.length+(elementData.length>>1)];
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData=newArray;
		}
		elementData[size++]=obj;
	}
	
	public E get(int index) {
		checkRang(index);//�ж������Ƿ��쳣
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
		checkRang(index);//�ж������Ƿ��쳣
		elementData[index]=element;
	}
	
	//�ж������Ƿ��쳣
	public void checkRang(int index) {
		//�����ж������Ƿ�Ϸ���size=10--->����Ϊ[0,9)
		if(index<0||index>size-1) {
		//���Ϸ�
		throw new RuntimeException("�������Ϸ���"+index);
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
