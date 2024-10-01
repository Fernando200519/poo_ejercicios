public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle is " + circle2.getArea());
    }
}