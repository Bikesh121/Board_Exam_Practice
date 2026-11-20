package VariableLengthArguments;

public class Main {

    static int sum(int... num){

        int total = 0;

        for(int n : num){
            total += n;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20, 15));
        System.out.println(sum(5, 10));
    }
}
