package Ch_09_Objects_and_Classes;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + Circle.getNumberOfObjects());

        Circle c1 = new Circle();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.getRadius() + ") and number of circle objects (" + c1.getNumberOfObjects() + ")");

        Circle c2 = new Circle(5); // Modify c1
        c1.setRadius(9);
        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.getRadius() + ") and number of Circle objects (" + c1.getNumberOfObjects() + ")");
        System.out.println("c2: radius (" + c2.getRadius() + ") and number of Circle objects (" + c2.getNumberOfObjects() + ")");
    }
}
