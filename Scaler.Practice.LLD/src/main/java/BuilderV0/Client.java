package BuilderV0;

public class Client {
    public static void main(String[] args) {

//        to create Student First Create Builder then Pass is to Student
//        StudentBuilder builder = new StudentBuilder();
//        builder.setAge(25);
//        builder.setBatch("Apr23");
//        builder.setGradeYear(2023);
////        builder.setCourse("Abc");
//        Student st =  new Student(builder);
//        System.out.println(st.course);
//    }



//  there are so many builders user get confused.
//  so we are asking Student class to give builder of student class

//        StudentBuilder builder = Student.getBuilder();
//        builder.setAge(25);
//        builder.setBatch("Apr23");
//        builder.setGradeYear(2023);
////        builder.setCourse("");
//        Student st =  new Student(builder);
//        System.out.println(st.course);

//        this will work like Stream
//        1.use getBuilder() to get builder Obj
//        2.use Builder Obj to Set Mandatory Attribute
//        3.use  Builder obj to call build method this will intialize and return Student Object
        Student s = Student.getBuilder()
                .setAge(25)
//                .setCourse("dsa")
                .setGradeYear(2024)
                .setBatch("Aug 24")
                .build();
        System.out.println(s.course);
    }


}
