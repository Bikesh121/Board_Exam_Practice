package Inheritance;

class Animal{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog is barking...");
    }
}

public class SingleLevel {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sound();
    }
}
