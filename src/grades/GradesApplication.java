package grades;

import java.util.HashMap;
import java.util.Random;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("batman", new Student("Christian"));
        students.put("cptmarvel", new Student("Brie"));
        students.put("starlord", new Student("Chris"));
        students.put("dianaprince", new Student("Gal"));

        Random random = new Random();
        for(int i=0; i < 4; i++) {
            students.get("batman").addGrade(random.nextInt(100));
            students.get("cptmarvel").addGrade(random.nextInt(100));
            students.get("starlord").addGrade(random.nextInt(100));
            students.get("dianaprince").addGrade(random.nextInt(100));
        }


    }
}
