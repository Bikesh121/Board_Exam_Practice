package Arrays;
import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[3][];

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter the number of columns for row "+ (i+1) +": ");
            int cols = sc.nextInt();

            num[i] = new int[cols];

            System.out.println("Enter the elements of row "+ (i+1) +": ");
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
