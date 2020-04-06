package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.grades = new ArrayList<>();
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student("Josh");
        System.out.println(student.getName());
        student.addGrade(50);
        student.addGrade(100);
        student.addGrade(67);
        student.addGrade(23);
        System.out.println(student.getGradeAverage());
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
