// java book page nuber 144 6.11 (a) question

public class FloydsTriangle {
    public static void main(String[] args) {
        int i, j, n = 1;
        // System.out.println("1");
        for (i = 1; i <= 13; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();

        }
    }
}