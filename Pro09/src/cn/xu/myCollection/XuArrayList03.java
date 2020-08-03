package cn.xu.myCollection;

import java.util.Arrays;

/**
 * �Զ���ʵ��һ��ArrayList,���ײ�ԭ��
 * ������������
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