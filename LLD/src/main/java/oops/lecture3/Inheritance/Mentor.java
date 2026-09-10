package oops.lecture3.Inheritance;

public class Mentor extends User {
    String company;
    double avgRating;

    public Mentor(String name, String email) {
        super(); // should be the first line of child constructor.
        System.out.println("Mentor Constructor");
    }

    public Mentor() {

    }

    public void fun() {
        System.out.println("Mentor class fun method.");
    }
}
