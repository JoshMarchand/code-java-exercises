import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String firstString = "We don't need no education\n" +
//                "We don't need no thought control";
//        System.out.println(firstString);
//
//        firstString = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(firstString);
//
//        firstString = "In windows, the main drive is usually C:\\";
//        System.out.println(firstString);
//
//        firstString = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//        System.out.println(firstString);

//        System.out.println("Hello World!");


        do {
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while (true);


    }
}
