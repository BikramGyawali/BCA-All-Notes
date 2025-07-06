
import java.util.Random;

public class random_Number {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(); // for integer
        double d = r.nextDouble();
        byte[] b = new byte[1]; // create a array to store 1 element
        r.nextBytes(b); // fill array with bytes
        byte f = b[0]; // for byte
        System.out.println("Random number" + n);
        System.out.println("Random double " + d);
        System.out.println("Random byte " + f);
    }
}