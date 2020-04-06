package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.printf("perim: %f", box1.getPerimeter());
        System.out.println();
        System.out.printf("area: %f", box1.getArea());
        System.out.println();

        Rectangle box2 = new Square(5);

        System.out.printf("perim: %f", box2.getPerimeter());
        System.out.println();
        System.out.printf("area: %f", box2.getArea());
        System.out.println();


    }
}
