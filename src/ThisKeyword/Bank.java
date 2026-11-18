package ThisKeyword;

public class Bank {

    void DisplayName(){
        System.out.println("Siddhartha Bank Limited");
    }

    void show(){
        this.DisplayName();
        System.out.println("Best bank of Nepal!");
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.show();
    }
}
