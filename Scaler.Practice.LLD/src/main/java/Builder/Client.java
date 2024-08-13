package Builder;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.setAge(25);
        builder.setBatch("Apr23");
        builder.setGradeYear(2023);
//        builder.setCourse("Abc");
        Student st =  new Student(builder);
        System.out.println(st.course);
    }

//    builder.set


}
