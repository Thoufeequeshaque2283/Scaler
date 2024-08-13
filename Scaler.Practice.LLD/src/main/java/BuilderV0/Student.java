package BuilderV0;

public class Student {
    final int age;
    final String name;
    final String batch;
    final int gradeYear;
    String course;

    public Student(StudentBuilder studentBuilder){

        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.batch = studentBuilder.batch;
        this.gradeYear = studentBuilder.gradeYear;
        this.course = studentBuilder.course;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }


}
