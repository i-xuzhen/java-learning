package cn.xu.contaniner;

import java.util.*;

/**
 * ���Ե�������ʹ��
 */
public class TestIterator {
    public static void main(String[] args) {
       // testIteratorList();
       // testIteratorSet();
       // testIteratorMap1();
        testIteratorMap2();
    }


    public static void testIteratorList(){
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for(Iterator<String> iter=list.iterator();iter.hasNext();){
            String temp=iter.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet(){
        Set<String> set=new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        for(Iterator<String> iter=set.iterator();iter.hasNext();){
            String temp=iter.next();
            System.out.println(temp);
        }
    }

    //����Map����������Ҫ����Set������
    public static void testIteratorMap1(){//Map��һ�ֱ��������������ڵ�
        Map<Integer,String> map1=new HashMap<>();
        map1.put(2,"aa");
        map1.put(1,"bb");
        map1.put(3,"cc");

        Set<Map.Entry<Integer,String>> ss= map1.entrySet();

        for(Iterator<Map.Entry<Integer,String>> iter=ss.iterator();iter.hasNext();){
            Map.Entry<Integer,String> temp=iter.next();
            System.out.println(temp.getKey()+"--"+temp.getValue());
        }
    }

    public static void testIteratorMap2() {//Map�ڶ��ֱ���������������ֵ
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "aa");
        map2.put(1, "bb");
        map2.put(3, "cc");

        Set<Integer> keySet = map2.keySet();

        for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext(); ) {
            Integer temp = iter.next();
            System.out.println(temp + "--" + map2.get(temp));
        }

    }
    }

