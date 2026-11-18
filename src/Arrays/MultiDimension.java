package Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] num = new int[3][3];

        System.out.println("Enter elements of Matrix A: ");
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of Matrix A: ");
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
