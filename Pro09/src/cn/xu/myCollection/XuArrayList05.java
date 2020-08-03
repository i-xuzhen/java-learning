package cn.xu.myCollection;

import java.util.Arrays;

/**
 * �Զ���ʵ��һ��ArrayList,���ײ�ԭ��
 * ����ɾ��remove����
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
	
	//�����Ƴ�����
	public void remove(E element) {
		//element������������Ԫ�ذ����Ƚϣ����һ���Ƚ�Ϊture����
		for(int i=0;i<size;i++) {
			if(element.equals(get(i))) {//���������еıȽϲ��������õ�equals������==
			//����Ԫ�شӴ˳��Ƴ�
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