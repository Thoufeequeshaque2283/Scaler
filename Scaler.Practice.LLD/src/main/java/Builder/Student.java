package Builder;

public class Student {
    int age;
    String name;
    String batch;
    int gradeYear;
    String course;

    public Student(StudentBuilder studentBuilder){
        if(studentBuilder.age < 10){
            throw new IllegalArgumentException("Age must be at least 10");
        }
        if(studentBuilder.gradeYear > 2024){
            throw new IllegalArgumentException("Grade year must be less than 2024");
        }
        if(studentBuilder.course != null){
            course = studentBuilder.course;
        }else{
            course = "Academy";
        }
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.batch = studentBuilder.batch;
        this.gradeYear = studentBuilder.gradeYear;
    }
}
