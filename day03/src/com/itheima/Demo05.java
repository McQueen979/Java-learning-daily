package com.itheima;

/*
    案例: for循环案例5(统计思想)
        统计有几个水仙花数（是一个三位数，每个位数的立方的和 = 这个数本身）
 */
public class Demo05 {
    public static void main(String[] args) {
        int count1 = 0;
        for (int a = 100; a <= 999; a++) {
            //数值拆分
            int ge = a % 10;
            int shi = a / 10 % 10;
            int bai = a / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == a) {
                System.out.println(a + "是水仙花数");
                count1++;
            }
        }
        System.out.println("水仙花数有:" + count1 + "个");

        //  先说有几个数，再输出这些数
        //  定义数组存储所有水仙花数（最多4个，因为三位数中只有4个水仙花数）
        int[] narcissisticNumbers = new int[10]; // 足够存储所有可能的水仙花数
        int count = 0; // 记录水仙花数的实际个数

        // 一次遍历找出所有水仙花数并存储
        for (int a = 100; a <= 999; a++) {
            int ge = a % 10;
            int shi = a / 10 % 10;
            int bai = a / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == a) {
                narcissisticNumbers[count] = a; // 存储水仙花数
                count++; // 计数器加1
            }
        }
        // 先输出总数
        System.out.println("水仙花数有:" + count + "个");
        // 再输出所有水仙花数
        System.out.println("它们分别是：");
        for (int i = 0; i < count; i++) {
            System.out.println(narcissisticNumbers[i]);
        }

        int count2 = 0;
        for (int b = 1000; b <= 9999; b++) {
            //数值拆分
            int ge = b % 10;
            int shi = b / 10 % 10;
            int bai = b / 100 % 10;
            int qian = b / 1000 % 10;
            if (ge * ge * ge * ge + shi * shi * shi * shi + bai * bai * bai * bai + qian * qian * qian * qian == b) {
                System.out.println(b + "是四叶玫瑰数");
                count2++;
            }
        }
        System.out.println("水仙花数有:" + count2 + "个");

        //五角星数
        //六合数
    }
}
