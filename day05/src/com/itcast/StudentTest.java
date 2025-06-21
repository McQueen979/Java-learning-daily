package com.itcast;

/*
    学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //类名 对象名 = new 类名 () ;
        Student s1 = new Student();

        System.out.println(s1);
        //com.itcast.Student@4eec7777   //地址值
        //全类名       com.itcast.Student
        //@         分隔符
        //4eec7777  十六进制的内存地址

        System.out.println(s1.getName());   //null  字符串初始值是 null
        System.out.println(s1.getAge());    //0     整数初始值是 0

        //给对象赋值
        s1.setName("吴彦祖");
        s1.setAge(18);

        //打印对象属性
        System.out.println(s1.getName());   //吴彦祖
        System.out.println(s1.getAge());    //18

        //调用对象的方法
        s1.study();
        s1.eat();
    }
}
