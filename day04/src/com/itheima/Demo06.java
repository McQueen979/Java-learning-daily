package com.itheima;

/*
    案例:设计一个方法用于输出[1-n](n>1)之间奇数的和,并打印所有的奇数
 */

public class Demo06 {
    public static void main(String[] args) {
        int sum = printOddNumbersAndSum(10);    //其实应该分离打印和计算功能，遵循单一职责原则
        System.out.println("奇数的和为：" + sum);
    }

    public static int printOddNumbersAndSum(int n) {
        if (n < 1) {
            System.out.println("你输入的数据必须大于1");
            return 0;   //这里不能写  return; ,因为当n < 1时，执行return;语句，这相当于返回void（无返回值）。但方法声明的返回类型是int，
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

/*public class Demo06 {
    public static void main(String[] args) {
        //6.调用方法
        printSum(-10);
    }
    //1.定义方法
    public static void printSum(int n){
        //7.对n进行判断
        if(n < 1){
            System.out.println("你输入的数据必须大于1");
            //8.结束方法
            return;
        }
        //2.定义求和变量
        int sum = 0;
        //3.使用for循环获取范围内数据
        for (int i = 1; i <= n ; i++) {
            //4.累加
            sum += i;
        }
        //5.打印结果
        System.out.println("sum:" + sum);
    }
}*/
