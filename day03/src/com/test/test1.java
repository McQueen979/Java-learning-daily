package com.test;

public class test1 {
    public static void main(String[] args) {
        // for 循环
        for (int i = 1; i < 3; i++) {
            System.out.println("我爱Java");
        }
        // System.out.println(i);   //因为 i 是在 for 循环里定义的，所以循环结束后就消失了，不能输出 i
        System.out.println("--------");

        // while 循环
        int i = 1;
        //前面那个 for 循环结束之后，for 循环里定义过的 i 已经释放掉了，所以不影响这里在重复定义
        while (i < 3) {
            System.out.println("我爱Java");
            i++;
        }
        System.out.println(i);      // i 在 main 方法中定义，所以循环结束之后，不影响他的输出
        System.out.println("--------");
    }
}
