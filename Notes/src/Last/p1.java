package Last;

/*
        商场根据消费金额不同, 折扣也不同, 折扣的规则如下(P代表消费的总金额)
            P >= 2000 7折
            1000 <= P < 2000 8折
            500 <= P < 1000 9.5折
            P < 500 不打折
        要求根据输入的消费金额, 输出对应的折扣和折扣前后的金额
*/

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("===== 商场折扣计算器 =====");
        System.out.println("请输入价格:（输入-1结束程序）:");
        Scanner sc = new Scanner(System.in);    //创建Scanner对象，用于获取控制台输入. 使用System.in作为参数创建Scanner对象时，它就会从标准输入获取数据。
        //int p = sc.nextInt();                 //从输入流里读取下一个标记，并尝试把它解析成一个int类型的值。
        while (true) {
            double amount = sc.nextDouble();    // 使用nextDouble()读取小数
            if (amount == -1) {
                System.out.println("程序已退出！");
                break;
            }
            /*if (amount >= 2000) {
                System.out.println("你消费了" + amount + "元,享受7折优惠,优惠后的金额为:" + (amount * 0.7));
            } else if (amount >= 1000) {
                System.out.println("你消费了" + amount + "元,享受8折优惠,优惠后的金额为:" + (amount * 0.8));
            } else if (amount >= 500) {
                System.out.println("你消费了" + amount + "元,享受95折优惠,优惠后的金额为:" + (amount * 0.95));
            } else if (amount > 0) {
                System.out.println("你消费了" + amount + "元,不打折");
            } else
                System.out.println("输入金额有误");*/
            // 计算折扣
            double discountRate;    //折扣率
            String discountDesc;    // 存储折扣的描述信息

            if (amount >= 2000) {
                discountRate = 0.7;
                discountDesc = "7折";
            } else if (amount >= 1000) {
                discountRate = 0.8;
                discountDesc = "8折";
            } else if (amount >= 500) {
                discountRate = 0.95;
                discountDesc = "9.5折";
            } else {
                discountRate = 1.0;
                discountDesc = "不打折";
            }

            // 计算折后金额
            double discountedAmount = amount * discountRate;        //  折后价格
            double savedAmount = amount - discountedAmount;         //  省钱数

            // 格式化输出（保留两位小数）
            System.out.printf("你消费了 %.2f 元，享受%s优惠，优惠后的金额为: %.2f 元%n", amount, discountDesc, discountedAmount);
            System.out.printf("节省了: %.2f 元%n", savedAmount);
            System.out.println("----------------------------");
        }
        sc.close();     // 关闭Scanner资源
    }
}