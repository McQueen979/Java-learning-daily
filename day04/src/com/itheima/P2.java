package com.itheima;

public class P2 {
    public static void main(String[] args) {
        //1 直接调用: 用来调用void的方法
        isEvenNumber(23);
        //2 赋值调用: 将返回值赋值给对应类型的变量
        int sum = getSum(100, 200);
        System.out.println("两数之和为:" + sum);
        double avg = getAverage(6, 10, 15);
        System.out.println("平均数是:" + avg);
        //3 打印调用:相当于直接打印返回值,一般用于学习或者测试
        System.out.println("水仙花数的个为:" + getCount());
        /*
        这一句话实际上就是:
            int count= getCount();
            System.out.println("水仙花数的个数:" + count);
         */
    }
    //定义方法1,判断一个整数奇偶性 -> void   //有参 无反
    public static void isEvenNumber(int a) {
        if (a % 2 == 0) {
            System.out.println("a是偶数");
        } else {
            System.out.println("a是奇数");
        }
    }
    //定义方法2,求两个整数的和
    public static int getSum(int a, int b) {
        // int sum = a + b;
        return a + b;   //完全可以跳过创建中间变量这一步，直接返回 a + b 的计算结果
    }
    //定义方法3.计算三个整数的平均值并返回 -> double //有参 有反
    public static double getAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        return  avg;    //同上,也可以跳过创建 avg 这一步. 要时将来当计算逻辑复杂时,不建议直接省略中间变量
    }
    //定义方法4,判断有几个水仙花数,并返回数量 -> int  //无参有反
    public static int getCount() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
        }
        return count;
    }
}
