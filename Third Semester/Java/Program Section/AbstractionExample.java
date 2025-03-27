abstract class add {
    abstract void addition();

    void different() {
        int a = 5, b = 4;
        System.out.println("The difference is " + (a - b));
    }
}

class newAdd extends add {
    void addition() {
        int a = 4, b = 5;
        System.out.println("The sum is " + (a + b));
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        newAdd obj = new newAdd();
        obj.addition();
        obj.different();
    }
}
