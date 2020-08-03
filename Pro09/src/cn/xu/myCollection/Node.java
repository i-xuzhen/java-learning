package cn.xu.myCollection;
/**
 * 用于测试自定义链表，
 * 自己得额外定义一个节点对象
 * 节点Node(Entry)两者都是节点的意思
 * @author shen
 *
 */
public class Node {
	
	Node previous;//上一个节点的指针
	Node next;//下一个节点的指针
	Object element;//本节点的数据本身
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
