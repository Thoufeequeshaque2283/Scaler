package PrototypeAndRegistry;

public class Student  implements ProtoType{
    int id;
    String name;
    String batch;
    public Student(){}
    public Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    public Student copy() {
        return new Student(this);
    }
}
