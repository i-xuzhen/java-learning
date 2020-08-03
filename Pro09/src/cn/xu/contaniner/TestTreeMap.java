package cn.xu.contaniner;

import java.util.Map;
import java.util.TreeMap;

/**
 * 测试TreeMap
 * 和HashMap相比，TreeMap实现了同样的Map接口，用法对于调用者而言没有区别
 * HashMap效率高于TreeMap,在需要排序的时候选择使用TreeMap
 *
 * HashMap:线程不安全，效率高；允许key或value为null;
 * HashTable:线程安全，效率低，不允许key或value为null;使用和HashMap相同
 *
 */
public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(20, "aa");
        treemap1.put(3, "bb");
        treemap1.put(6, "cc");
        //按照key递增的方式排序
        for (Integer key : treemap1.keySet()) {
            System.out.println(key + "------" + treemap1.get(key));
        }
        Map<Emp,String> treemap2= new TreeMap<>();
        treemap2.put(new Emp(100,"张三",50000),"是个小孩");
        treemap2.put(new Emp(200,"李四",70000),"是个男人");
        treemap2.put(new Emp(150,"王五",67000),"是个女人");

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