package cn.xu.myCollection;
/**
 * ���ڲ����Զ�������
 * �Լ��ö��ⶨ��һ���ڵ����
 * �ڵ�Node(Entry)���߶��ǽڵ����˼
 * @author shen
 *
 */
public class Node {
	
	Node previous;//��һ���ڵ��ָ��
	Node next;//��һ���ڵ��ָ��
	Object element;//���ڵ�����ݱ���
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Node(Node previous, Node next, Object element) {
		super();
		this.previous = previous;
		this.next = next;
		this.element = element;
	}
	public Node(Object element) {
		super();
		this.element = element;
	}
	
	
	
	
	
}
