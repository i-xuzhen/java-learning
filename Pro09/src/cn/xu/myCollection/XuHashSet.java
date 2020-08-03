package cn.xu.myCollection;

import com.sun.jdi.Value;

import java.util.HashMap;

/**
 * 手动实现一个HashSet,深刻理解HashSet底层原理
 */
public class XuHashSet {

    HashMap map;
    private static final Object PRESENT=new Object();

    public XuHashSet() {
        map = new HashMap();
    }

    public int size(){
        return map.size();
    }
    public void add(Object o){
        map.put(o, PRESENT);
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(Object key:map.keySet()){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        XuHashSet set=new XuHashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);
    }


}
