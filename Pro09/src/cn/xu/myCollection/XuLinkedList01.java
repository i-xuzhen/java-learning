package cn.xu.myCollection;
/**
 * ��������
 * �ص㣺��ѯЧ�ʵͣ���ɾЧ�ʸߣ��̲߳���ȫ
 * ÿһ��Node����������һ���ڵ��ָ�룬���ڵ�����ݣ���һ���ڵ��ָ��
 * @author shen
 *
 */
public class XuLinkedList01 {
	
	private Node first;
	private Node last;
	private int size;
	
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
		XuLinkedList01 list=new XuLinkedList01();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
	}
	
	
	
	
}