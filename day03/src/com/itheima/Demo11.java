package com.itheima;
/*
    continue和break的使用       ？？？？？？？？？？？？？、、
 */
public class Demo11 {
    public static void main(String[] args) {
        /*
            2次 break;
            7次 continue;
            13次 System.out.println("宋雨琦真帅");
         */

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("宋雨琦真帅啊");
            }
            System.out.println("宋雨琦真帅");
        }
    }
}
