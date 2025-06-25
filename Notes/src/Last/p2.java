package Last;

import java.util.Random;

/*
    利用Random生成一个[10-100]之间的整随机数num，统计[10-num]之间奇数的个数
    最终在控制台打印所有的奇数，和个数
*/
public class p2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(91) + 10;  //
        System.out.println("随机生成的数是:" + num);
        int count = 0;
        if (num == 10) {
            System.out.println("范围内没有奇数, count = 0");
            return; //通过 return 立即退出 main 方法，避免执行后续的循环
        }
        System.out.println("奇数列表:");
        for (int i = 10; i <= num; i++) {
            if (i % 2 == 1) {
                count++;
                System.out.print(i + " ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("count:" + count);
    }
}
