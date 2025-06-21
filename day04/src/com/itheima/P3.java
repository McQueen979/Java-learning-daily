package com.itheima;
/*
    方法重载的好处？
        让调用者不用记忆太多的方法名
        调用方法时，JVM 会根据参数列表匹配对应的方法
            三个方法都叫 sum , 不需要区分什么sum1 sum2 ...
            比如输出打印 只需要 print()就好了,不用区分printint printdouble printchar...
 */

public class P3 {
    public static void main(String[] args) {
        getSum(5,10,15);    //三个getSum全是求和的,输入两个double就调用第一个,输入两个int就调用第二个,输入三个int就调用第三个.
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
