import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


    try{
        transport();

    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
         public static void transport() throws IOException{
        try (Car car = new Car()) {
            car.drive();
        } finally {
            System.out.println("Finish");

        }
    }
}