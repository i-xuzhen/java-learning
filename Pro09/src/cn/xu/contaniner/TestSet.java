package cn.xu.contaniner;

import java.util.HashSet;
import java.util.Set;

/**
 * ����Set   ���򣬲����ظ�
 ������List ������ظ�
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();

        set1.add("aa");
        set1.add("bb");
        set1.add("aa");//�����ظ�
        System.out.println(set1);

//        set1.remove("bb");
//        System.out.println(set1);

        Set<String> set2=new HashSet<>();
        set2.add("����");
        set2.add("aa");
        set2.add("cc");
//        set2.addAll(set1);
        set2.retainAll(set1);//ȡ����
        System.out.println(set2);


    }
}
