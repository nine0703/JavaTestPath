package com.test.main.extend;

public class Cat extends Alive{
    public Cat() {
    }

    public Cat(String color, String breed) {
        super(color, breed);
    }

    public void Eat(){
        System.out.println(this.getColor()+"的"+this.getBreed() +"正在吃饭，以猫猫独有的方式");
    }
    public void catchMOUSE(){
        // 问老师，这里的this为什么可以省略，以及省略好不好
        System.out.println(this.getColor()+"的"+this.getBreed() +"正在抓老鼠");
    }
}
