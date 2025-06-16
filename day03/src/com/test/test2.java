package com.test;

public class test2 {
    public static void main(String[] args) {
        // 测试for循环
        System.out.println("=== for循环测试 ===");
        for (int i = 3; i < 3; i++) {
            System.out.println("我爱Java");
        }
        System.out.println("--------");

        // 测试while循环
        System.out.println("=== while循环测试 ===");
        int j = 3;
        while (j < 3) {
            System.out.println("我爱Java");
            j++;
        }
        System.out.println("--------");

        // 测试do-while循环
        System.out.println("=== do-while循环测试 ===");
        int k = 3;
        do {
            System.out.println("我爱Java");
            k++;
        } while (k < 3);
        System.out.println("--------");
    }
}
