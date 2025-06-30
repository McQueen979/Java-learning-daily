package com.practice;
/*
    案例: for循环案例7 (逢七过)
        在整数1到100中,个位不能是7,十位不能是7,并且该数不能是7的倍数
        打印满足条件的数据

    扩展: 一行打印20个,使用空格分开
        System.out.println();   //打印并换行 ！！！
        System.out.print();     //一行打印   ！！！
 */

public class P7 {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 100; a++) {
            if (a % 7 != 0 && a % 10 != 7 && a / 10 % 10 != 7) {
                System.out.print(a+" ");
                count++;
                if (count % 20 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
