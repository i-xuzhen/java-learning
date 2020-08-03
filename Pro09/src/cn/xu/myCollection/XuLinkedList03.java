package cn.xu.myCollection;
/**
 * ��������
 * �ص㣺��ѯЧ�ʵͣ���ɾЧ�ʸߣ��̲߳���ȫ
 * ÿһ��Node����������һ���ڵ��ָ�룬���ڵ�����ݣ���һ���ڵ��ָ��
 * 
 * ����remove����
 * @author shen
 *
 */
public class XuLinkedList03 {
	
	private Node first;
	private Node last;
	private int size;
	
	//[]
	//[a,b,c,d,e,f]         2  
	public Object get(int index) {
		
		if(index<0|index>size-1) {
			throw new RuntimeException("�������ֲ��Ϸ���"+index);
		}
		Node temp=getNode(index);	
		
		return temp!=null?temp.element:null;	
	}
	
	public Node getNode(int index) {
		if(index<0|index>size-1) {
			throw new RuntimeException("�������ֲ��Ϸ���"+index);
		}
		Node temp=first;	
		//����Ѱ��Ч��
		if(index<(size>>1)) {
			for(int i=0;i<index;i++) {
			temp=temp.next;
			}
		}else {
			temp=last;
			for(int i=size-1;i>index;i--) {
				temp=temp.previous;
			}
		}
		return temp;
	}
	
	
	
	public void remove(int index) {
		Node temp=getNode(index);
		if(temp!=null) {
			Node up=temp.previous;
			Node down=temp.next;
			if(up!=null) {
				up.next=down;		
			}
			if(down!=null) {
				down.previous=up;
			}
			if(index==0) {//��ɾ��Ԫ���ǵ�һ��ʱ
				first=down;
			}
			if(index == size-1) {//��ɾ��Ԫ��ʱ���һ��ʱ
				last=up;
			}
			size--;
		}
		
	}
	

	public int size() {
		return size;
	}
	
	//[]
	//[a,b]
	//[a,b,c]
	public void add(Object obj) {
		Node node=new Node(obj);
		if(first==null) {
			first=node;
			last=node;
		}else {
			
			node.previous=last;
			node.next=null;
			
			last.next=node;
			last=node;	
		}
		size++;
	}
	public String toString() {
		//[a,b,c]  first=a; last=c
		
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		
		Node temp=first;
		while(temp!=null) {
			sb.append(temp.element+",");
//			System.out.println(temp.element);
			temp=temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		XuLinkedList03 list=new XuLinkedList03();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.remove(0);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
	
	
	
	
}