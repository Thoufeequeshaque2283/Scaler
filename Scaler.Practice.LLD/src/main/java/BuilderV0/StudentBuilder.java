package BuilderV0;

public class StudentBuilder {
    int age;
    String name;
    String batch;
    int gradeYear;
    String course;

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public StudentBuilder setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
        return this;
    }
    public Student build(){
        if(this.age < 10){
            throw new IllegalArgumentException("Age must be at least 10");
        }
        if(this.gradeYear > 2024){
            throw new IllegalArgumentException("Grade year must be less than 2024");
        }
        if(this.course == null){
            course = "Academy";
        }
        return new Student(this);
    }

}
