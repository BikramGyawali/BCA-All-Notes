import java.lang.StringBuffer;

public class BufferExample {
    public static void main(String[] args) {

        String s = "HEllo";
        String ss = "World";
        StringBuffer s1 = new StringBuffer(s);
        s1.append(ss);
        System.out.println(s1);
        s1.setCharAt(4, '-');
        System.out.println(s1);
        int a = s1.indexOf(s);
        System.out.println(a);
    }
}
