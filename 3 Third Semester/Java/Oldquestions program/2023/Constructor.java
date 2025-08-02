/* What is Constructor overloading? Write a class Distance containing private variable feet of type int and inches of type int, suitable constructors and three methods addDistance, subtractDistanceand display Distance for adding, subtracting and displaying objects. Write a separate classMyDistance containing main method to create, add, subtract and display distance objects. */

class Distance {
    private int feet;
    private int inches;

    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    public void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }

    public Distance addDistance(Distance d) {
        int tf = this.feet + d.feet;
        int ti = this.inches + d.inches;
        return new Distance(tf, ti);

    }

    public Distance subtractionDistance(Distance d) {
        int tf = this.feet - d.feet;
        int ti = this.inches - d.inches;
        if (ti < 0) {
            tf--;
            ti += 12;
        }
        return new Distance(tf, ti);
    }

    public void displayDistance() {
        System.out.println("Distance is : " + feet + " feet " + inches + " inches");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 6);
        Distance d2 = new Distance(2, 3);
        Distance d3 = d1.addDistance(d2);
        Distance d4 = d1.subtractionDistance(d2);
        System.out.println("Distance 1:");
        d1.displayDistance();
        System.out.println("Distance 2:");
        d2.displayDistance();
        System.out.println("Adding distances:");
        d3.displayDistance();
        System.out.println("Subtracting distances:");
        d4.displayDistance();
    }
}