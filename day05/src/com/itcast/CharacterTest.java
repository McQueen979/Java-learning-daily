package com.itcast;

public class CharacterTest {
    public static void main(String[] args) {
        //1.空参构造 + set      测空参
        Character character1 = new Character();
        //赋值
        character1.setName("镜流");
        character1.setAttribute("冰");
        character1.setStar(5);
        character1.setPath("毁灭");
        //取值
        System.out.println("空参构造:"+character1.getName()+","+character1.getAttribute()+","
                +character1.getStar()+","+character1.getPath());

        //2.代参构造直接赋值        测代参
        Character character2 = new Character("卡芙卡","雷",5, "虚无");
        System.out.println("代参直接构造:"+character2.getName()+","+character2.getAttribute()+","
                +character2.getStar()+","+character2.getPath());

    }
}
