package BuilderV1;

public class Student {
    final int age;
    final String name;
    final String batch;
    final int gradeYear;
    String course;

    private Student(StudentBuilder studentBuilder){

        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.batch = studentBuilder.batch;
        this.gradeYear = studentBuilder.gradeYear;
        this.course = studentBuilder.course;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();

    }

    static public class StudentBuilder {
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

        public Student build() {
            if (this.age < 10) {
                throw new IllegalArgumentException("Age must be at least 10");
            }
            if (this.gradeYear > 2024) {
                throw new IllegalArgumentException("Grade year must be less than 2024");
            }
            if (this.course == null) {
                course = "Academy";
            }
            return new Student(this);
        }
    }
}
