package com.test;
/*
    案例: while循环案例1(求奇数和)
        求1到100之间的奇数和
 */

public class test3 {
    public static void main(String[] args) {

        //  用for
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("for循环：1到100之间的奇数和为：" + sum);

        //  用while
        int sum2 = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                sum2 += i;
            }
            i++;
        }
        System.out.println("while循环：1到100之间的奇数和为：" + sum2);

        //  用do while
        int sum3 = 0;
        int j = 1;
        do {
            if (j % 2 != 0) {
                sum3 += j;
            }
            j++;
        } while (j <= 100);
        System.out.println("do while循环：1到100之间的奇数和为：" + sum3);

        //  或者直接减去一些循环，直接每一次加到 sum 上后，i = i + 2;
    }
}

