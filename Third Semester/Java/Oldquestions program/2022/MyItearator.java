
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;



public class MyItearator{
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        list.add("Bob");
        list.add("Bikram");
        list.add("Ram");

        Iterator <String> it= list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for comparator
 
 
        Collections.sort(list,new Comparator <String>(){
            public int compare(String s1,String s2){
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted List");

        it=list.iterator();


        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}