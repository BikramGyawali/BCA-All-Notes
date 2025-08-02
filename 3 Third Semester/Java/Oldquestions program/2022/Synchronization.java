class Counter {
    synchronized void print(){
        for(int i= 1;i<=5;i++){
            System.out.println("Thread" + Thread.currentThread().getName()+ "-" + i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
  System.out.println(e);
            }
        }
    }
}
 class MyThread extends Thread {
    Counter co;
    MyThread(Counter c){
        this.co=c;
    }
    public void run(){
        co.print();
    }
}



public class Synchronization {
    public static void main(String [] args){
        Counter c= new Counter();
        MyThread t= new MyThread(c);
        MyThread t2=new MyThread(c);
        t.start();
        t2.start();

    }
}
