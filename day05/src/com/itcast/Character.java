package com.itcast;

public class Character {

    // 1. 成员变量: 必须私有. 被private修饰的成员只能在本类中使用. 针对私有的, 外界只能间接使用: 通过 get 和 set
    private String name;        //名字
    private String attribute;   //属性
    private int star;           //星级
    private String path;        //命途

    // 2. 构造方法: 提供空参和代参, java支持重载
    //快捷键: Alt + INSERT -> Constructor -> 1.选择空参 2.选择代参的全部
    public Character() {
    }

    public Character(String name, String attribute, int star, String path) {
        this.name = name;
        this.attribute = attribute;
        this.star = star;
        this.path = path;
    }

    // 3. 成员方法: 针对私有成员的变量, 必须提供对应的 get & set
    //快捷键: Alt + INSERT -> Getter and Setter -> 全选, 创建
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        /*
        局部变量 name 和成员变量 name，重名了！
        由于 java 遵循就近原则，这里是局部变量 name 自己给自己赋值！
        我们想让：成员变量 = 局部变量；
        使用 this：代表本类对象，可以调用本类的成员
         */
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}







/*
    //成员方法 -> 展示对象属性
    public void show() {
        System.out.println("名字: " + name);
        System.out.println("属性: " + attribute);
        System.out.println("星级: " + star);
        System.out.println("命途: " + path);
    }*/
    //成员方法 ->

