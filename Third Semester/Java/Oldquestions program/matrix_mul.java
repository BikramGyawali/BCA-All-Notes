
import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int i, j, k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the matrix A");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                System.out.print("Enter element : ");
                a[i][j] = s.nextInt();

            }

        }

        System.out.println("Enter the matrix B");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                System.out.print("Enter element : ");
                b[i][j] = s.nextInt();

            }

        }

        // Multiplication

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
