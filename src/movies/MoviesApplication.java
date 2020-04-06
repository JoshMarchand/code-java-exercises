package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
do {
    switch (input.getInt(0, 5)) {
        case 0:

            break;
        case 1:

            break;
        case 2:

            break;
        case 3:

            break;
        case 4:

            break;
        case 5:

            break;
    }
} while (Input.yesNo("Would you like to continue"));


    }

}
