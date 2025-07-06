import java.lang.Exception;

class me extends Exception {

    me(String message) {
        super(message);
    }
}

public class Ownexceptiion {
    public static void main(String[] args) {

        try {
            int age = 15;
            if (age < 18) {
                throw new me("Age is less");
            } else {
                System.out.println("Age is valid");
            }
        } catch (me e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
