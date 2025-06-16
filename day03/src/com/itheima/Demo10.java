package com.itheima;
/*
    需求: do...while打印1到10

    do...while循环的特点?
        无论判断条件是否成立, 至少执行一次循环体
 */
public class Demo10 {
    public static void main(String[] args) {
        int j = 1;
        do{
            System.out.println("7月必须达到面试测试岗的需求");
            j++;
        }
        while (j<=5);

        int i=1;
        do{
            System.out.println(i);
            i++;
        } while (i<=5);
    }
}
