public class MethodOverLoading {
    int pluseMethod(int a, int b) {
        return a + b;
    }

    double pluseMethods(double a, double b) {
        return a + b;
    }

    float pluseMethod(float a, float b) {
        return (float) (a + b);
    }

    public static void main(String[] args) {
        MethodOverLoading mol = new MethodOverLoading();
        System.out.println(mol.pluseMethod(3, 3));
        System.out.println(mol.pluseMethods(3.33, 5.55));
        System.out.println(mol.pluseMethod(4.4f, 4.5f));
    }
}
