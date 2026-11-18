public class PassByValue {

    static void change(int x){
        x = 100;
        System.out.println("Changed value of x: "+x);
    }

    public static void main(String[] args) {
        int x = 10;

        change(x);

        System.out.println("Original value of x: "+x);
    }
}
