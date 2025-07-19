
public class jagged {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
        int n = a.length;
        for (int i = 0; i <= n; i++) {
            int r = 0;
            for (int j = 0; j < a[i].length; j++) {
                r += a[i][j];
            }
            System.out.println(r);
        }
    }
}