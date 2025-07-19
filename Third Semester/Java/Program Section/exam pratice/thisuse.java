class addition {
    private int a;
    private int b;

    public addition() {
        System.out.println("This is inside");
    }

    public addition(int a, int b) {
        this();
        this.a = a;
        this.b = b;
    }

    void add() {

        this.show();
        int c = a + b;
        System.out.println(c);
    }

    void show() {
        System.out.println("This is outside");
    }

}

public class thisuse {
    public static void main(String[] args) {
        addition a = new addition(10, 20);
        a.add();
    }
}
