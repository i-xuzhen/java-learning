package cn.xu.contaniner;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap
 * ��HashMap��ȣ�TreeMapʵ����ͬ����Map�ӿڣ��÷����ڵ����߶���û������
 * HashMapЧ�ʸ���TreeMap,����Ҫ�����ʱ��ѡ��ʹ��TreeMap
 *
 * HashMap:�̲߳���ȫ��Ч�ʸߣ�����key��valueΪnull;
 * HashTable:�̰߳�ȫ��Ч�ʵͣ�������key��valueΪnull;ʹ�ú�HashMap��ͬ
 *
 */
public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(20, "aa");
        treemap1.put(3, "bb");
        treemap1.put(6, "cc");
        //����key�����ķ�ʽ����
        for (Integer key : treemap1.keySet()) {
            System.out.println(key + "------" + treemap1.get(key));
        }
        Map<Emp,String> treemap2= new TreeMap<>();
        treemap2.put(new Emp(100,"����",50000),"�Ǹ�С��");
        treemap2.put(new Emp(200,"����",70000),"�Ǹ�����");
        treemap2.put(new Emp(150,"����",67000),"�Ǹ�Ů��");

        for (Emp key : treemap2.keySet()) {
            System.out.println(key + "------" + treemap2.get(key));
        }

    }
}

class Emp implements Comparable<Emp> {
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) {
        if (this.salary < o.salary) {
            return 1;
        } else if (this.salary > o.salary) {
            return -1;
        } else {
            if (this.id > o.id) {
                return 1;
            } else if (this.id < o.id) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public String toString(){
        return "id:"+id+",name:"+name+",salary:"+salary;
    }
}