import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int i, j, k;
        System.out.println("Enter the matrix");

        System.out.println("Enter the element for 1st matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter Element :  ");
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the element for B");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter Element :  ");
                b[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.println(c[i][j] + "\t ");
            }
            System.out.println("     ");
        }
    }
}
