import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        double d = r.nextDouble();
        byte[] b = new byte[1];
        r.nextBytes(b);
        byte f = b[0];

        System.out.println(a);
        System.out.println(d);
        System.out.println(f);

    }

}
