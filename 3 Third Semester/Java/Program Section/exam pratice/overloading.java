class sum {
    int c;

    void addition(int a, int b) {
        c = a + b;
        System.out.println(c);
    }

    void addition(int a, int b, int d) {
        int add = a + b + d;
        System.out.println(add);
    }
}

public class overloading {
    public static void main(String[] args) {
        sum s = new sum();
        s.addition(1, 2, 3);
        s.addition(1, 2);
    }
}
