package Inheritance;

class Bank{

    void display(){
        System.out.println("This is bank.");
    }
}

class Nabil extends Bank{

    void interestRate(){
        System.out.println("We provide 12% interest rate.");
    }
}

class Prime extends Bank{

    void loan(){
        System.out.println("We offer loan services.");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        Nabil nb = new Nabil();
        Prime pr = new Prime();

        nb.display();
        nb.interestRate();

        pr.display();
        pr.loan();
    }
}
