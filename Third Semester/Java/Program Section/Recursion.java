public class Recursion {
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }

    public static int sum(int i) {  // make the method static so that it can be called in the main method
        if (i > 0) {
            return i + sum(i - 1);  // recursive call reduce i by 1
        } else {
            return 0;
        }
    }
}
