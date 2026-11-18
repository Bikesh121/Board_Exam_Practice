package Abstraction;

abstract class Animal {

    abstract void sound();

    void eat(){
        System.out.println("Animal is eating....");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Dog is barking....");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();

        a1.eat();
        a1.sound();
    }
}
