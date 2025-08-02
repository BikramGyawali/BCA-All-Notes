import java.lang.String;
import java.lang.StringBuffer;

public class string_strinBuffer {

    public static void main(String[] args) {
        String str = "HEllo";
        String str1 = "World";
        StringBuffer sb = new StringBuffer(str);

        // String operations
        Boolean b1 = str.equals(str1);
        System.out.println(b1); // false

        System.out.println(str.toUpperCase()); // HELLO

        System.out.println(str.concat(str1)); // HElloWorld

        System.out.println(str.length()); // 5

        // StringBuffer operations
        sb.append(str1);
        System.out.println(sb); // HElloWorld

        sb.setCharAt(4, '-');
        System.out.println(sb); // HEll-World
    }
}
