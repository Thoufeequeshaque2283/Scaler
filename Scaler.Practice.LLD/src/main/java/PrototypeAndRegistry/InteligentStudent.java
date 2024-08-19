package PrototypeAndRegistry;

public class InteligentStudent extends Student {
    int iq;
    public InteligentStudent(){}
    public InteligentStudent(InteligentStudent is) {
        super(is);
        this.iq = is.iq;
    }
    public InteligentStudent copy() {
        return new InteligentStudent(this);
    }


}
