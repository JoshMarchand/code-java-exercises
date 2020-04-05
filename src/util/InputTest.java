package util;

public class InputTest {
    private static Input input = new Input();

    public static void main(String[] args) {
//        Input.setScanner();
        input.getString("Enter string yo");
        input.getInt(5, 9);
    }


}
