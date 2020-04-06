package shapes;

public class Square extends Rectangle {
    double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea() {
        System.out.println("from side");
        return this.side * this.side;
    }

    public double getPerimeter() {
        System.out.println("from side");
        return 4 * side;
    }
}
