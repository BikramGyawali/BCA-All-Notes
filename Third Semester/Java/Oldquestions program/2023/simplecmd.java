public class simplecmd {
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("Usage : java simpleIntersest ");
            return;
                }
                double p= Double.parseDouble(args[0]);
                double r=Double.parseDouble(args[1]);
                double t= Double.parseDouble(args[2]);
                double si=(p*r*t)/100;
                System.out.println("Simple interest is :"+ si);

    }
}
