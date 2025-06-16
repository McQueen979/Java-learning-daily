package com.itheima;
/*
三种循环区别
    for和while:先判断,后执行
    do..while:先执行,后判断

    for的初始化变量,仅在循环内有效
    while的初始化变量,循环结束后还能使用

    知道循环次数-> for ->打印1-5,求1-100的和
    不知道循环次数->while->珠峰折纸->使用while循环主要分析循环继续的条件!!!
    不常用,能识别即可->do..while
 */

/*
    死循环
        如果写死循环, 必须找到循环的出口 (停止条件), 否则后面的代码执行不到!
 */
public class Demo12 {
    public static void main(String[] args) {
        int a = 1;
        //for
//        for(;;){
//            System.out.println("我停不下来了..");
//        }

        //while 常见
//        while (true){
//            System.out.println("我停不下来了..");
//        }

        //do..while
//        do{
//            System.out.println("我停不下来了..");
//        }while (true);
    }
}
