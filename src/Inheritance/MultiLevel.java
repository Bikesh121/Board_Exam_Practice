package Inheritance;

class Animals{

    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Fish extends Animals{

    void swim(){
        System.out.println("Fish is swimming...");
    }
}

class Shark extends Fish{

    void play(){
        System.out.println("Dolphin is playing...");
    }
}

public class MultiLevel {
    public static void main(String[] args) {

        Shark s = new Shark();

        s.eat();
        s.swim();
        s.play();
    }
}
