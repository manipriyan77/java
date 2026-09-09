package oops.lecture2.assignments.problem2;

public class Main {
//    Create a class Person with following requirements
//    Should have a data-member age
//    Should have a data-member name
//    Should support a constructor with both age and name
    public static void main(String[] args) {
        Person person1 = new Person(25, "John");
        Person person2 = new Person(30, "Jane");

        // With static fields, both references share the same age/name,
        // so person1 now also prints "Jane" / 30 — not the deep-copy behavior we want.
        System.out.println(person1.name + " is " + person1.age + " years old");
        System.out.println(person2.name + " is " + person2.age + " years old");
    }
}
