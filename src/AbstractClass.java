abstract class Animal{

    abstract void sound();

    void display(){
        System.out.println("This is animal.");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Dog barks.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.display();
        a.sound();
    }
}
