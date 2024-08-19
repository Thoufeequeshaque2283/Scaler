package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
//        Default Student -> this is Prototype
        Student student = new Student();
//        InteligentStudent student = new InteligentStudent();
//        student.iq = 100;
        student.name = "a";
        student.batch = "b";
        student.id = 1;
        Registry r = new Registry();
        r.setRegistry("Student",student);

        System.out.println(student);
//        now taking its copy

        Student s =  r.getRegistry("Student");
        System.out.println(s);
    }
}
