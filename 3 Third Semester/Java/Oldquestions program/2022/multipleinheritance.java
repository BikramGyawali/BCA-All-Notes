interface add {
    public void sum(int x, int y);

}

interface sub {
    public void diff(int a, int b);
}

class cal implements add, sub {
    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    public void diff(int a, int b) {
        System.out.println(a - b);
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        cal c = new cal();
        c.diff(4, 3);
        c.sum(3, 4);
    }
}
