public class MethodJava {
    public void speed(int x) {
        System.out.println("the speed of the car is " + x + " m\s");

    }

    static void people() {
        System.out.println("There are 30 people");
    }

    public static void main(String[] args) {
        people();
        MethodJava newSpeed = new MethodJava();
        newSpeed.speed(5);
    }
}
