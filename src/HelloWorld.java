import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);


        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi);

//        System.out.print("Enter integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words: ");
        String i1 = scanner.next();
//        String i2 = scanner.next();
//        String i3 = scanner.next();

        System.out.format("Word one: %s", i1);


//        int myFavoriteNumber = 7;
//        String myString = "Josh";
////        float myNumber = 3.14;
//
////        int x = 5;
////        System.out.println(++x);
////        System.out.println(x);
////
////        String theNumberThree = "three";
////        Object o = theNumberThree;
////        int three = (int) o;
////        System.out.print(three);
//
//        int x = Integer.MAX_VALUE;
//        System.out.println(x);
    }
}
