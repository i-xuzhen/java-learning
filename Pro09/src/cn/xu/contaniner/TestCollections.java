package cn.xu.contaniner;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Collections工具类
 * 注意区别：Collection是接口  Collections是工具类
 * 提供了对Set List Map 进行排序 填充 查找元素的辅助方法
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add("gao"+i);
        }
        System.out.println(list);

        Collections.shuffle(list);//对容器内的元素进行随机排列
        System.out.println(list);

        Collections.reverse(list);//逆序排列
        System.out.println(list);

        //若是自定义的类就用comparable接口排序
        Collections.sort(list);//升序排列/
        System.out.println(list);

        //二分法查找，对应元素的索引
        System.out.println(Collections.binarySearch(list,"gao5"));

        //用一个特定的对象重写整个容器
        Collections.fill(list,"hello");
        System.out.println(list);

    }
}
