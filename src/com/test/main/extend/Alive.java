package com.test.main.extend;

public class Alive {
    private String color;
    private String breed;

    public Alive() {
    }

    public Alive(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void Eat(){
        System.out.println(this.color+"的"+this.breed +"正在吃饭");
    }
    public void Sleep(){
        System.out.println(this.color+"的"+this.breed +"正在睡觉");
    }
}
