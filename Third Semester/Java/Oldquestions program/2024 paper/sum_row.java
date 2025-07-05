import java.util.Scanner;

public class sum_row {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int i, j;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter the element");
                a[i][j] = s.nextInt();
            }
            System.out.println("");
        }

        for (i = 0; i < 3; i++) {
            // int sum = 0;
            for (j = 0; j < 3; j++) {
                // sum += a[i][j]; this is for row
                // sum += a[j][i]; for column
                b[i][j] = a[j][i]; // for transpose

                System.out.print(b[i][j] + "    "); // for transpose to give space
            }
            System.out.println("");
            // System.out.println("The sum of " + (i + 1) + " row is " + sum + "");
            // System.out.println("The sum of " + (i + 1) + " column is " + sum + "");

        }
    }
}
