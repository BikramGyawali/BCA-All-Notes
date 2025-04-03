public class Series {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {

                // System.out.print(i);// for 1 22 333 ....
                System.out.print(j); // for 1 12 123 ....
            }
            System.out.println();
        }
    }
}
