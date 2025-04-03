class Number {
  int a = 5;
  int b = 10;
}

class Add extends Number {
  int c = 30;

  public void addition() {
    int sum = a + b;
    System.out.println(sum);
  }
}

class Sub extends Add {
  public void Sub() {
    int d = c - a;
    System.out.println("Subtraction is" + d);
  }
}

public class InheritanceAdd {
  public static void main(String args[]) {
    Add a = new Add();
    a.addition();
    Sub s = new Sub();
  }
}