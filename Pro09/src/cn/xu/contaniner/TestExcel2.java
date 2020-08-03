package cn.xu.contaniner;

import java.util.*;

/**
 * 测试表格数据的存储
 * 体会ORM思想
 * 每一行数据使用javabean对象存储，多行数据放到map或list中
 */
public class TestExcel2 {
    public static void main(String[] args) {
        User user1 = new User(1001, "张三", 30000, "2019.09.09");
        User user2 = new User(1002, "李四", 20000, "2018.09.09");
        User user3 = new User(1003, "王五", 70000, "2020.09.09");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for (User user : list) {
            System.out.println(user);
        }

        System.out.println("############");

        Map<Integer, User> map = new HashMap<>();
        map.put(1001,user1);
        map.put(1002,user2);
        map.put(1003,user3);
        Set<Integer> keySet=map.keySet();
        for(Integer key:keySet){
            System.out.println(key+"--->"+map.get(key));
        }

    }
}


class User {
    private int id;
    private String name;
    private double salary;
    private String hiredate;

    //一个完整的Javabean 得有无参构造器
    public User() {
        super();
    }

    public User(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }
}