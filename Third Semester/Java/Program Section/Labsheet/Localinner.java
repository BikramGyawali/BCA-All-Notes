public class Localinner {
    void add(int a,int b){
        int c=a+b;
        System.out.println("sum is"+c);
 class subtraction{
    
    void diff(int x,int y){
        int d=x-y;
        System.out.println("difference is "+d);
       }
       subtraction s= new subtraction();
       s.diff(5,4);
    }

 }

    public static void main(String[] args) {
        Localinner l = new Localinner();
        l.add(5, 6);
    }

}
