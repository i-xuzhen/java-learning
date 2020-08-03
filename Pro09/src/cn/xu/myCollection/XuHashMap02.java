package cn.xu.myCollection;
/*
 * 自定义HashMap
 *增加实现toString方法，方便查看map中的键值对
 */
public class XuHashMap02 {

	Node2[] table;  //位桶数组
	int size;		//存放键值对的个数

	public XuHashMap02() {
		table=new Node2[16];//长度一般定义成2的整数幂
	}

	public void put(Object key, Object value) {

		Node2 newNode=new Node2();
		newNode.hash=myHash(key.hashCode(),table.length);
		newNode.key=key;
		newNode.value=value;
		newNode.next=null;

		Node2 temp=table[newNode.hash];
		Node2 iterLast=null;
		boolean keyRepeat=false;

		if(temp==null) {
			//此处数组元素为空，则直接将新节点放进去
			table[newNode.hash]=newNode;
			size++;
		}else {
			//此除数组不为空，则遍历对应的链表
			while(temp!=null) {

				//判断key如果重复，则覆盖
				if(temp.key.equals(key)) {
					System.out.println("key重复了！");
					temp.value=value;//只是覆盖value,其它值(hash,key,next)保持不变
					keyRepeat=true;
					break;
				}else {
					//Key如果不重复，则
					iterLast=temp;
					temp=temp.next;
				}
			}
			//temp=null时，已经遍历到最后一个元素了
			if(!keyRepeat) {
				iterLast.next=newNode;
				size++;
			}
		}
	}

	public int myHash(int v,int length) {
		System.out.println("hash in myHash:"+(v&(length-1)));//效率高
		//System.out.println("hash in myHash:"+(v%(length-1)));//效率低
		return v&(length-1);
	}


	@Override
	public String toString() {
		//[10:aa 20:bb 30:cc]
		StringBuilder sb=new StringBuilder("{");
		//遍历bucket数组
		for(int i=0;i<table.length;i++) {
			Node2 temp=table[i];
			//遍历链表
				while(temp!=null) {
					sb.append("["+i+":"+temp.key+","+temp.value+"]");
					temp=temp.next;
				}
				//sb.append("\n");
		}
		sb.append("}");
		return sb.toString();
	}


	public static void main(String[] args) {
		XuHashMap02 m1=new XuHashMap02();
		m1.put(10, "aa");
		m1.put(20, "bb");
		m1.put(30, "cc");
		m1.put(20, "sssss");

		//53,69,85生成的hash值都是相同的，hash=5
		//一般是先算对应对象的hashcode，怎根据hashcode对16取余或其它更好的算法，
		//得到hash值。但是整数的hashcode就是它本身，故算Hash值时直接用本身来计算。
		m1.put(53, "gg");
		m1.put(69, "hh");
		m1.put(85, "kk");

		System.out.println(m1);
	}


}
