package ExceptionHandling;

import java.sql.SQLException;

public class Student {
    static  int doSomthing(int x) throws ClassNotFoundException,SQLException,RandomException {
//        return 1/x;

        if(x==0){
            throw new ArithmeticException();
        }else if(x==1){
            throw new ClassNotFoundException();
        }else if(x==2){
            throw new SQLException();
        }else if(x==3){
            throw new NullPointerException();
        }else if(x==4){
            throw new RandomException();
        }
    return 0;




    }
}
