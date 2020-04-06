package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        Measurable myShape;


        myShape = new Square(5);

        System.out.printf("perim: %f", myShape.getPerimeter());
        System.out.println();
        System.out.printf("area: %f", myShape.getArea());
        System.out.println();

        myShape = new Rectangle(5, 6);

        System.out.printf("perim: %f", myShape.getPerimeter());
        System.out.println();
        System.out.printf("area: %f", myShape.getArea());
        System.out.println();

//        System.out.println(myShape.getWidth());

    }
}
