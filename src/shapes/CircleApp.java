package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    private static int circleCount = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Enter your radius.");
            int num = scanner.nextInt();
            Circle circle = new Circle(num);
            System.out.printf("area is: %.2f%n", circle.getArea());
            System.out.printf("circumference is: %.2f%n", circle.getCircumference());
            circleCount++;
        } while (Input.yesNo("Would you like to continue?"));
        System.out.printf("You created %d circles.", circleCount);
    }

}
