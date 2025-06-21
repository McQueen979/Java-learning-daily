package com.itheima;

/*
    案例: 字符串相加

    当+号遇到字符串,就不是算数+了,而是字符串连接符
    字符串连接符可以让字符串和任意类型进行数据进行串联(拼接)

    后面我们常见于打印结果
        "sum:" + sum
        "avg:" + avg
        "姓名:" + name
 */
public class Demo04 {
    public static void main(String[] args) {
        //结果?
        System.out.println("it" + "heima");     // "itheima"
        System.out.println("itheima" + 666);    // "itheima666"
        System.out.println(1 + 99 + "年黑马");   // "100年黑马"
        System.out.println("年黑马" + 1 + 99);   // "年黑马199"
        System.out.println(1 + 99);             // "100"
        System.out.println("5+5=" + 5 + 5);     // "5+5=55"
        /*表达式是从左到右进行计算的。首先字符串 "5+5=" 与数字 5 相加，此时会触发字符串拼接操作，得到字符串 "5+5=5"。
        接着，这个新字符串再和第二个数字 5 相加，继续进行字符串拼接，最终结果为 "5+5=55"。*/
        System.out.println(5 + 5 + "=5+5");     // "10=5+5"
        /*同样从左向右计算。由于前面两个操作数都是数字，所以先进行加法运算，5 + 5 的结果是 10。
        结果 10 再与字符串 "=5+5" 相加，发生字符串拼接，最终输出 "10=5+5"*/
        System.out.println(5 + 5);              // "10"
        //如何让结果满足正常算式的结果?
        System.out.println("5+5=" + (5 + 5));   //"5+5=10"  先算括号内的5+5=10，然后从左往后
    }
}
