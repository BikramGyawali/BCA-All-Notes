
public class Constructor {
    int x;
    String name;

    public Constructor(int y, String myName) { // parameter
        x = y;
        name = myName;// passing argument

    }

    public static void main(String[] args) {
        Constructor cons = new Constructor(5, "Bikram"); // passin argument
        System.out.println(cons.x);
        System.out.println(cons.name);

    }
}