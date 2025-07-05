import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class set {
    public static void main(String[] args) {
        // Initial Set with duplicate "NewYork" (HashSet ignores duplicates)
        Set<String> s = new HashSet<>(Arrays.asList("London", "NewYork", "SanFrancisco", "Beijing", "NewYork"));
        System.out.println("Initial Set: " + s);
        // Output (order may vary): [London, NewYork, SanFrancisco, Beijing]

        s.add("Nepal");
        System.out.println("After adding Nepal: " + s);
        // Output: [London, NewYork, SanFrancisco, Beijing, Nepal]

        System.out.println("Size: " + s.size());
        // Output: 5

        s.remove("London");
        System.out.println("After removing London: " + s);
        // Output: [NewYork, SanFrancisco, Beijing, Nepal]

        System.out.println("Contains Nepal? " + s.contains("Nepal"));
        // Output: true

        Set<String> s1 = new HashSet<>(Arrays.asList("India", "Pakistan"));
        s.addAll(s1);
        System.out.println("After addAll(s1): " + s);
        // Output: [NewYork, SanFrancisco, Beijing, Nepal, India, Pakistan]

        Set<String> s2 = new HashSet<>(Arrays.asList("Pakistan", "India"));
        s.removeAll(s2);
        System.out.println("After removeAll(s2): " + s);
        // Output: [NewYork, SanFrancisco, Beijing, Nepal]

        Set<String> s3 = new HashSet<>(Arrays.asList("Nepal", "SanFrancisco"));
        s.retainAll(s3);
        System.out.println("After retainAll(s3): " + s);
        // Output: [SanFrancisco, Nepal]

        System.out.println("Final Set: " + s);
        // Final Output: [SanFrancisco, Nepal]
    }
}
