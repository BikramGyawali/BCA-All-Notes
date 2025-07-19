class animal {
    void sound() {
        System.out.println("This is sound of animal");
    }
}

class dog extends animal {
    void sound() {
        super.sound();
        System.out.println("This is sound of dog");
    }
}

public class overriding {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
    }
}
