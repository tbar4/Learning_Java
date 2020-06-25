package Ch_09_Objects_and_Classes;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.getRadius() + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.getRadius() + " is " + circle3.getArea());

        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + circle2.getRadius() + " is " + circle2.getArea());
    }
}

class Circle {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle() {
        numberOfObjects++;
        }

    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
