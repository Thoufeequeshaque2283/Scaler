package LamdasAndStreams;

public class Student implements Comparable<Student> {
    int age;
    double psp;
    String name;
    double attendance;
    public Student(int age, double PSP, String name, double attendance) {
         this.age = age;
         this.psp = PSP;
         this.name = name;
         this.attendance = attendance;
    }

    @Override
    public int compareTo(Student Other) {
        if(this.age > Other.age){
            return -1;
        }else if(this.age < Other.age){
            return 1;
        }
        return 0;
    }
    public String toString(){
        return this.name + " " + this.age + " " + this.psp + " " + this.attendance;
    }
}
