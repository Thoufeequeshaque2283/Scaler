package ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, SQLException,RandomException {
        while(true) {

            try {
                Student.doSomthing(1);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("End");
            }
        }
    }
}
