package Generics;

public class Pair <V, S>{
    V first;
    S second;
    public Pair(){}
    public Pair(V first, S second) {
        this.first = first;
        this.second = second;
    }
    public V getFirst() {
        return first;
    }
    public void setFirst(V first) {
        this.first = first;
    }
    public S getSecond() {
        return second;
    }
    public void setSecond(S second) {
        this.second = second;
    }
    //<T> for we are using diferent data type here so its must
    public <T> void doSomething(T val){
        System.out.println(val);
    }
    // if we use static v and s will not be available here
//    public static void doSomething(V val,S val2){
//        System.out.println(val);
//    }

}
