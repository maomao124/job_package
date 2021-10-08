/**
 * Project name(项目名称)：作业 封装
 * Package(包名): PACKAGE_NAME
 * Class(类名): TestPersonDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 22:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TestPersonDemo
{
    public static void main(String[] args)
    {
        /********* begin *********/
        // 声明并实例化一Person对象p
        Person p = new Person();
        p.setAge(18);
        p.setName("张三");
        p.talk();
        // 给p中的属性赋值


        // 调用Person类中的talk()方法

        /********* end *********/

    }
}

// 在这里定义Person类
class Person
{
    /********* begin *********/
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void talk()
    {
        System.out.println("我是：" + name + "，今年：" + age + "岁");
    }

    /********* end *********/
}

