package cn.xu.contaniner;

import java.util.Set;
import java.util.TreeSet;

/**
 * ����TreeSet��ʹ��
 * ��ϤComparable�ӿ� �����Բο�TreeMap��ʹ�ã�
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(300);
        set.add(200);
        set.add(500);
        for(Integer m:set){
            System.out.println(m);
        }
        Set<Emp> ser2=new TreeSet<>();
        ser2.add(new Emp(1001,"xuzhen",5000));
        ser2.add(new Emp(1012,"xuzhen",5000));
        ser2.add(new Emp(1003,"xuzhen",5000));
        for(Emp m:ser2){
            System.out.println(m);
        }

    }

}
