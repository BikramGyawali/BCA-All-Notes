class a extends Thread{
   public void run(){
     for(int i=2;i<=10;i++){
        int n =10;
       System.out.println(n*i);
    }
   }
}

class b extends Thread{
    public void run(){
        for(int i=2;i<=10;i++){
        int n =1;
       System.out.println(n*i);
    }
    }
}


public class Threads {
    public static void main(String[] args) {
        new a().start();
        new b().start();
    }
}
