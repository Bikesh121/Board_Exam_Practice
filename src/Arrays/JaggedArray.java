package Arrays;

public class JaggedArray {
    public static void main(String[] args) {

        int[][] num = new int[3][];

        num[0] = new int[]{1};
        num[1] = new int[]{2, 3};
        num[2] = new int[]{4, 5, 6};

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
