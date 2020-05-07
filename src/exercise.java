public class exercise {
    private String name;
    private int miles;

    public exercise(String name, int miles) {
        this.name = name;
        this.miles = miles;
    }

    public static void main(String[] args) {
        exercise[] newArr = new exercise[3];

        newArr[0] = new exercise("chevy", 3000);

    }


}
