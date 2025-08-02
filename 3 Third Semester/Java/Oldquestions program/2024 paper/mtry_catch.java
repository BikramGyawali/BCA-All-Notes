public class mtry_catch {
    public static void main(String[] args) {

        try {
            int[] a = new int[2];
            a[3] = 5;
        
            int c;
            try {
                c = 5 / 0;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Arthimetic error");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array error");
        }

    }
}
