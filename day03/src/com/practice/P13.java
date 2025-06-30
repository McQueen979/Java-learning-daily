package com.practice;

/*
    Random随机数对象:
        1. 导包 import java.util.Random;
        2. 创建对象 Random r = new Random();
        3. 调用方法,接收数据 int num = r.nextInt(数据); //范围取值: 从0到指定数据,包含0包含指定数据

    猜数字小游戏:
        使用Random随机数对象, 生成一个[1-100]之间的整数, 作为正确答案
        使用Scanner, 提示用户录入猜的数据并接收, 使用if语句判断用户猜的结果, 打印对应提示
            情况1: 猜的数超出了[1-100]的范围! 请重新输入!
            情况2: 猜大了
            情况3: 猜小了
            情况4: 恭喜你!猜对了
 */

import java.util.Random;

public class P13 {
    Random r = new Random();
    int num = r.nextInt(100);
}
