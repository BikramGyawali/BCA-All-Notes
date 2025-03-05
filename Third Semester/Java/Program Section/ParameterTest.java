public class ParameterTest {
    void getNames(String name) {
        System.out.println(name + "  Get in parameter");
    }

    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();
        pt.getNames("Bikram");
    }
}
