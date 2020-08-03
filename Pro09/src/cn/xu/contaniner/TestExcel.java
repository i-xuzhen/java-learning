package cn.xu.contaniner;

import java.util.*;

/**
 * ����ʹ���������洢������ݣ�Map��ʾһ�����ݣ��������ݱ�ʾ���Map,
 * �����Map����List,ʵ�ֱ�����ݵĽ���
 *
 * ���ORM˼�룺����ӳ���ϵ
 *
 * GDBC���ݿ��
 */
public class TestExcel {
    public static void main(String[] args) {

        Map<String,Object> row1=new HashMap<>();
        row1.put("id",1001);
        row1.put("name","����");
        row1.put("salary",20000);
        row1.put("��ְ����","2018.05.05");

        Map<String,Object> row2=new HashMap<>();
        row2.put("id",1002);
        row2.put("name","����");
        row2.put("salary",30000);
        row2.put("��ְ����","2019.05.05");

        Map<String,Object> row3=new HashMap<>();
        row3.put("id",1003);
        row3.put("name","����");
        row3.put("salary",15000);
        row3.put("��ְ����","2020.05.05");

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
