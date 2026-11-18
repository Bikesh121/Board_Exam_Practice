package Abstraction;

abstract class Bank {

    abstract void name();

    void withdraw(){
        System.out.println("Withdrawing money....");
    }

    void deposit(){
        System.out.println("Depositing money....");
    }
}

class NabilBank extends Bank{

    public void name(){
        System.out.println("This is Nabil Bank!");
    }
}

class Test{
    public static void main(String[] args) {
        Bank b1 = new NabilBank();

        b1.name();
        b1.deposit();
        b1.withdraw();
    }
}

