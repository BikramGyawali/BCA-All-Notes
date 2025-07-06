import java.util.Scanner;
// import java.lang.String;
// import java.lang.StringBuffer;


public class palindrome {
    public static void main (String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String str=s.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String rvs=sb.reverse().toString();
     
        // if(str.equals(rvs)) {
        //     System.out.println("The string is a palindrome");
        // } else {
        //     System.out.println("The string is not a palindrome");
        // }
    }
}
