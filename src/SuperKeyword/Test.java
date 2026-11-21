package SuperKeyword;

class Animal{

    void sound(){
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal{

    void display(){
        super.sound();
        System.out.println("Dog barks.");
    }
}

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}
