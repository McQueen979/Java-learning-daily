package com.itcast;

public class CameraTest {
    public static void main(String[] args) {
        //测试空参
        Camera C1 = new Camera();
        C1.setBrand("佳能");
        //....
        C1.show();

        System.out.println("---------------------------");

        //测试代参
        Camera C2 = new Camera("尼康","单反","+18--55",
                "日本",2600,"黑色",220);
        C2.show();
    }
}
