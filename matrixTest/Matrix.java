package matrixTest;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[9][4];
        int k = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = ((j+2)*(i+1));
                System.out.printf("%3d * %d = %3d",j+2,i+1,arr1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = ((j + 6) * (i + 1));
                System.out.printf("%3d * %d = %3d", j + 6, i + 1, arr1[i][j]);
            }
            System.out.println();
        }
    }
}
