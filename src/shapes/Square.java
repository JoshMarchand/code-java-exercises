package shapes;

public class Square extends Quadrilateral {
    public Square(double length) {
        super(length, length);
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        setLength(length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
//    double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        System.out.println("from side");
//        return this.side * this.side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("from side");
//        return 4 * side;
//    }


}
