public class ExampleException{
    public static void main (String[] args){
        try{
            String a=null;
            int count=a.length();
        }
        catch(NullPointerException e){
            System.out.println("Null pointer");
        }

        
        try{
            String b="Bikram";
            int a= Integer.parseInt(b);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}