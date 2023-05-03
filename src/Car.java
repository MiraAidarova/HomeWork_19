import java.sql.Driver;

public class Car implements AutoCloseable {


    public Car() {

    }


    public void close() {
        System.out.println("Машина жабылып жатат.");
    }


    public void drive() {
        System.out.println("Машина журуп жатат.");
    }
}