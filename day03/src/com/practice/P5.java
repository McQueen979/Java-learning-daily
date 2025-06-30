package com.practice;

/*
    案例: for循环案例5(统计思想)
        统计有几个水仙花数（是一个三位数，每个位数的立方的和 = 这个数本身）
 */
public class P5 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 100; num <= 999; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("水仙花数有:" + count + "个");
    }
}
