public class HaltingCondition {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int i, int j) {
        if (j > i) {
            return j + sum(i, j - 1);
        } else {
            return j;
        }
    }
}
