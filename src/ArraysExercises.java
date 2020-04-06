import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Josh");
        people[1] = new Person("Auburne");
        people[2] = new Person("Melanie");

        for (Person person : people) {
            System.out.printf("%s%n", person.getName());
        }

//        Arrays.toString(addPerson(people, new Person("Joey")));

//        Person addition = new Person("Joey");
//        addPerson(people, addition).toString();
//        System.out.printf("%s", addPerson(people, new Person("Joey")));

//        System.out.printf("%s", String Array.toString(addPerson(people, new Person("Bill"))));
    }

    public static Person[] addPerson(Person[] personArr, Person add) {
        Person[] newArr = new Person[personArr.length + 1];

        for (int i = 0; i <= personArr.length - 1; i++) {
            newArr[i] = personArr[i];
        }
        newArr[newArr.length - 1] = add;
        return newArr;
    }
}
// comment1
