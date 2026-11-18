package Recursion;
import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int terms = sc.nextInt();

        for(int i = 0; i < terms; i++){
            System.out.print(fibo(i)+"\t");
        }
    }
}
