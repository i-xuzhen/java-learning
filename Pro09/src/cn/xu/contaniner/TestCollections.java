package cn.xu.contaniner;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����Collections������
 * ע������Collection�ǽӿ�  Collections�ǹ�����
 * �ṩ�˶�Set List Map �������� ��� ����Ԫ�صĸ�������
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add("gao"+i);
        }
        System.out.println(list);

        Collections.shuffle(list);//�������ڵ�Ԫ�ؽ����������
        System.out.println(list);

        Collections.reverse(list);//��������
        System.out.println(list);

        //�����Զ���������comparable�ӿ�����
        Collections.sort(list);//��������/
        System.out.println(list);

        //���ַ����ң���ӦԪ�ص�����
        System.out.println(Collections.binarySearch(list,"gao5"));

        //��һ���ض��Ķ�����д��������
        Collections.fill(list,"hello");
        System.out.println(list);

    }
}
