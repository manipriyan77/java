package oops.lecture1;

import oops.lecture1.assignments.Problem1;

public class Student {
    String name;
    int age;
    double attendance;
    double score;

    void bookClasses() {
        System.out.println("Booking Class");
    }

    Problem1 newProblem = new Problem1();

    String value = newProblem.display();
}