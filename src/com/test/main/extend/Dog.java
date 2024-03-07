package com.test.main.extend;

public class Dog extends Alive{
    public Dog() {
    }

    public Dog(String color, String breed) {
        super(color, breed);
    }
    public void Shout() {
        System.out.println(this.getColor()+"的"+this.getBreed() +"正在大叫");
    }

}
