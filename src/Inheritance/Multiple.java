package Inheritance;

interface Father{

    void height();
}

interface Mother{

    void faceShape();
}

class Child implements Father, Mother{

    public void height(){
        System.out.println("Inherited by Father!");
    }

    public void faceShape(){
        System.out.println("Inherited by Mother!");
    }
}

public class Multiple {
    public static void main(String[] args) {

        Child c = new Child();

        c.height();
        c.faceShape();
    }
}
