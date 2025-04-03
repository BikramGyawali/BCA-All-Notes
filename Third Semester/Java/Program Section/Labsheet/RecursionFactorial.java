// factorial of a number using recursion with constructor in java
public class RecursionFactorial {
    int x;
    int fact = 1;

    // constructor
    RecursionFactorial(int n) {
       x = n;
        fact = factorial(x);
    }

    // method to calculate factorial
    int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        RecursionFactorial rf = new RecursionFactorial(5);
        System.out.println("Factorial of " + rf.x + " is: " + rf.fact);
    }
}