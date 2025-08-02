// program for the addition and multilication using lambda 

interface InnerLambda {
    int operation(int a, int b);

}

public class Lambda {
    public static void main(String[] args) {
        InnerLambda add = (a, b) -> a + b;
        InnerLambda mul = (a, b) -> a * b;

        int r = add.operation(5, 3);
        System.out.println(r);
        int m = mul.operation(2, 3);
        System.out.println(m);
    }

}
