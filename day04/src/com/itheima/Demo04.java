package com.itheima;
/*
    案例: 方法练习(输出较大值) -> 带参数带返回值
        定义方法,接收两个整数,判断较大值并返回
        调用方法接收返回值,并打印
 */
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入两个整数(用空格隔开):");
        int a= sc.nextInt();
        int b= sc.nextInt();
        //调用方法
        int max = getMax(a,b);
        System.out.println("max:" + max);
    }

    //定义方法,返回一个 int 类型的
    public static int getMax(int a, int b) {
        //返回较大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
