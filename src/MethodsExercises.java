import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//

//        System.out.println(add(3, 4));
//        System.out.println(subtract(3, 4));
//        System.out.println(multiply(3, 4));
//        System.out.println(divide(3, 4));
//        System.out.println(modulus(3, 4));





    }

    public static void dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 6: ");
        System.out.println("Roll the die (R): ");
        if (!(scanner.nextLine().equalsIgnoreCase("r"))) {
            dice();
        }



    }

    public static void factorial() {
        System.out.println("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput < 1 || userInput > 10) {
            factorial();
        } else {
            int finalNum;
            for (int i = 1; i <= userInput; i++){
                finalNum = 1;
                System.out.print(i + "! = ");
                for (int i2 =  1; i2<= i; i2++){
                    finalNum *= i2;
                    System.out.print(i2 + " ");
                    if (i2 < i){
                        System.out.print("x ");
                    }
                }

                System.out.println("= " + finalNum);

            }

        }
    }

    public static void range() {
        System.out.println("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput < 1 || userInput > 10) {
            range();
        } else {
            System.out.println();
        }
    }

    public static float add(int one, int two) {
        return one + two;
    }

    public static float subtract(int one, int two) {
        return one - two;
    }

    public static float multiply(int one, int two) {
        return one * two;
    }

    public static float divide(float one, float two) {
        return one / two;
    }

    public static float modulus(float one, float two) {
        return one % two;
    }
}

