class fruits {
    int size;
    String test;
    String name;

    fruits(String fname, String ftest, int fsize) {
        this.name = fname;
        this.test = ftest;
        this.size = fsize;
    }

    void eat() {
        System.out.println("Fruits name is " + name + " and test is " + test);
    }
}

class Apple extends fruits {
    Apple(String fname, String ftest, int fsize) {
        super(fname, ftest, fsize); // go to the parent class constructor which is fruits as arguments
    }

    void eat() {
        System.out.println("Fruits name is " + name + " and test is " + test);
    }
}

class Mango extends fruits {
    Mango(String fname, String ftest, int fsize) {
        super(fname, ftest, fsize); // go to the parent class constructor which is fruits as arguments
    }

    void eat() {
        System.out.println("Fruits name is " + name + " and test is " + test);
    }
}

public class tester {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Sweet", 5);
        Mango m = new Mango("Mango", "Sweet", 6);
        a.eat();
        m.eat();
    }
}
