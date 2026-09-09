package oops.lecture2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
//        StudentConstructor parameterizedStudent= new StudentConstructor("Manipriyan",29,77);
//        StudentConstructor defaultStudent= new StudentConstructor();
//        System.out.println("DEBUD");

        Seat s1 = new Seat();
        Seat s2 = new Seat();
        Seat s3 = new Seat();

        List<Seat> seats = new ArrayList<>();
        seats.add(s1);
        seats.add(s2);
        seats.add(s3);

        Car c1 = new Car();
        c1.seats=seats;

        Car c2 = new Car(c1);

        System.out.println("DEBUG");
    }
}
