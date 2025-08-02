interface add {
    public void sum(int x, int y);

}

interface sub {
    public void diff(int a, int b);

}

class Calculation implements add, sub {

    public void sum(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }

    public void diff(int a, int b) {
        int d = a - b;
        System.out.println(d);
    }
}

public class multiple {
    public static void main(String[] args) {
        Calculation ca = new Calculation();
        ca.sum(5, 4);
        ca.diff(6, 5);

    }
}
