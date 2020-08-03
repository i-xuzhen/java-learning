package cn.xu.myCollection;

/*
 * �Զ���HashMap
 *���Ʒ�װ�����ӷ���
 */
public class XuHashMap04<K,V> {

    Node3[] table;  //λͰ����
    int size;        //��ż�ֵ�Եĸ���

    public XuHashMap04() {
        table = new Node3[16];//����һ�㶨���2��������
    }

    public void put(K key, V value) {
        //���Ҫ���ƻ���Ҫ�������������

        Node3 newNode = new Node3();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node3 temp = table[newNode.hash];
        Node3 iterLast = null;
        boolean keyRepeat = false;

        if (temp == null) {
            //�˴�����Ԫ��Ϊ�գ���ֱ�ӽ��½ڵ�Ž�ȥ
            table[newNode.hash] = newNode;
            size++;
        } else {
            //�˳����鲻Ϊ�գ��������Ӧ������
            while (temp != null) {

                //�ж�key����ظ����򸲸�
                if (temp.key.equals(key)) {
                    System.out.println("key�ظ��ˣ�");
                    temp.value = value;//ֻ�Ǹ���value,����ֵ(hash,key,next)���ֲ���
                    keyRepeat = true;
                    break;
                } else {
                    //Key������ظ�����
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            //temp=nullʱ���Ѿ����������һ��Ԫ����
            if (!keyRepeat) {
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public int myHash(int v, int length) {
        // System.out.println("hash in myHash:" + (v & (length - 1)));//Ч�ʸ�
        //System.out.println("hash in myHash:"+(v%(length-1)));//Ч�ʵ�
        return v & (length - 1);
    }


    @Override
    public String toString() {
        //[10:aa 20:bb 30:cc]
        StringBuilder sb = new StringBuilder("{");
        //����bucket����
        for (int i = 0; i < table.length; i++) {
            Node3 temp = table[i];
            //��������
            while (temp != null) {
                sb.append("[" + i + ":" + temp.key + "," + temp.value + "]");
                temp = temp.next;
            }
            //sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length);
        V value = null;
        if (table[hash] != null) {
            Node3 temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    value = (V)(temp.value);
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
        return value;
    }





    public static void main(String[] args) {
        XuHashMap04 m1 = new XuHashMap04();
        m1.put(10, "aa");
        m1.put(20, "bb");
        m1.put(30, "cc");
        m1.put(20, "sssss");

        //53,69,85���ɵ�hashֵ������ͬ�ģ�hash=5
        //һ���������Ӧ�����hashcode��������hashcode��16ȡ����������õ��㷨��
        //�õ�hashֵ������������hashcode����������������Hashֵʱֱ���ñ��������㡣
        m1.put(53, "gg");
        m1.put(69, "hh");
        m1.put(85, "kk");

        System.out.println(m1);
        System.out.println(m1.get(53));
    }


}