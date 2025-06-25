package Last;

// 按照"从大到小"的顺序输出四位数中的个位+百位=十位+千位的数字, 并统计个数

public class p3 {
    public static void main(String[] args) {
        int count = 0;  //  count 的定义不能放在 for 循环里, 放里面的话 for 循环结束后, count 就没了. 因为那时 count 的作用域仅限于 for 循环内部。
        for (int a = 9999; a > 1000; a--) {
            int ge = a % 10;
            int shi = a / 10 % 10;
            int bai = a / 100 % 10;
            int qian = a / 1000 % 10;
            if (ge + bai == shi + qian) {
                System.out.print(a + " ");
                count++;
                if (count % 30 == 0) {
                    System.out.println();
                }
                //简略写法: System.out.print(a + (++count % 30 == 0 ? "\n" : " "));
            }
        }
        System.out.println();
        System.out.println("count:" + count);
    }
}
