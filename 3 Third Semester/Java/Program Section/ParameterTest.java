public class ParameterTest {
    void getNames(String name, int age) {
        System.out.println(name + " is " + age + " year old");
    }

    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();
        pt.getNames("Bikram", 18);

    }
}
