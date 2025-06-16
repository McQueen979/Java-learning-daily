package com.itheima;
/*
    需求:
    定义一个方法,接收三个整数,获取中间值并打印.通过键盘获取三个整数,作为参数传递调用方法
 */
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入三个整数(用空格隔开):");    //（用空格分隔），这与Scanner.nextInt()的读取方式一致。
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        getMiddle(a,b,c);   //调用
        sc.close();         // 关闭Scanner资源,避免资源泄漏.
    }

    public static void getMiddle(int a, int b, int c) {
        //判断中间值: mid = sum - max - min
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        int min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        int mid = (a + b + c) - min - max;
        System.out.println("中间值是:" + mid);
    }
}
//  两个方法中都定义了abc.不同的方法中的定义是平级的.所以不影响