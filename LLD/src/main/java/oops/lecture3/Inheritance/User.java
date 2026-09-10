package oops.lecture3.Inheritance;

public class User {
    String name;
    String email;
    String password;

    User(String name) {
        System.out.println("User Constructor with only name argument");
        this.name = name;
    }

    User(String name, String email) {
        System.out.println("User Constructor with name & email argument");
        this.name = name;
        this.email = email;
    }

    public User() {
        System.out.println("Default Constructor of User.");
    }

    public void fun() {
        System.out.println("User class fun method.");
    }
}
