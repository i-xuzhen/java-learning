package cn.xu.test;

/**
 * alt+ /  代码自动补全
 * alt + insert 自动生成构造方法
 * ctrl+shift + 回车  补全结尾
 * ctrl+ j 自动代码生成模板
 *
 * ctrl+ alt +i 代码自动缩进
 *ctrl+ e 显示最近修改的代码
 * ctrl+alt+L 格式化代码
 * ctrl+ p 方法参数提示
 * ctrl+alt+T 把选中代码放入if for 等里面
 */
public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


    }
}
