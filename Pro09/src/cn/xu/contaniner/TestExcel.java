package cn.xu.contaniner;

import java.util.*;

/**
 * 测试使用容器来存储表格数据：Map表示一行数据，多行数据表示多个Map,
 * 将多个Map放入List,实现表格数据的建立
 *
 * 理解ORM思想：对象映射关系
 *
 * GDBC数据库表？
 */
public class TestExcel {
    public static void main(String[] args) {

        Map<String,Object> row1=new HashMap<>();
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("salary",20000);
        row1.put("入职日期","2018.05.05");

        Map<String,Object> row2=new HashMap<>();
        row2.put("id",1002);
        row2.put("name","李四");
        row2.put("salary",30000);
        row2.put("入职日期","2019.05.05");

        Map<String,Object> row3=new HashMap<>();
        row3.put("id",1003);
        row3.put("name","王五");
        row3.put("salary",15000);
        row3.put("入职日期","2020.05.05");

        List<Map<String,Object>> table1=new ArrayList<>();

        table1.add(row1);
        table1.add(row2);
        table1.add(row3);

        for(Map<String,Object> row:table1){
            Set<String> keySet=row.keySet();
            for(String key:keySet){
                System.out.print(key+":"+row.get(key)+" ");
            }
            System.out.println();
        }
    }
}
