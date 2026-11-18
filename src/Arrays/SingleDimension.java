package Arrays;
import java.util.Scanner;

public class SingleDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }


        System.out.println("The entered elements are: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]+"\t");
        }
    }
}
