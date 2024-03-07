package com.test.main.extend;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("yellow","波斯猫");
        Cat c2 = new Cat();
        c1.catchMOUSE();
        c1.Eat();
        c1.Sleep();
        c2.Eat();

        Dog d1 = new Dog("red","泰迪");
        d1.Shout();
        d1.Eat();
        d1.Sleep();

    }
}
