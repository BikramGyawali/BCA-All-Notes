// java book page nuber 144 6.8 question

public class Range {
    public static void main(String[] args) {
        int marks[] = { 1, 0, 50, 70, 80, 100, 45, 77, 90 }, i;
        int a = 0, b = 0, c = 0, f = 0;

        for (i = 0; i < marks.length; i++) {
            if (marks[i] >= 81 && marks[i] <= 100)
                a++;
            else if (marks[i] >= 61 && marks[i] <= 80)
                b++;
            else if (marks[i] >= 41 && marks[i] <= 60)

                c++;
            else if (marks[i] >= 0 && marks[i] <= 40)
                f++;

        }
        System.out.println("In the range of 81 to 100 is " + a);
        System.out.println("In the range of 61 to 80 is " + b);
        System.out.println("In the range of 41 to 60 is " + c);
        System.out.println("In the range of 0 to 40 is " + f);

    }
}