package cn.xu.contaniner;

import java.util.*;

/**
 * 测试迭代器的使用
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

    //两种Map遍历方法都要赋给Set来遍历
    public static void testIteratorMap1(){//Map第一种遍历方法：遍历节点
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

    public static void testIteratorMap2() {//Map第二种遍历方法：遍历键值
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

