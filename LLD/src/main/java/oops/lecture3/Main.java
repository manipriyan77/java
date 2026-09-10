package oops.lecture3;

import oops.lecture3.Inheritance.D;
import oops.lecture3.Inheritance.Mentor;
import oops.lecture3.Inheritance.User;

public class Main {
    static void main() {
        D d= new D();
        Mentor mentor = new Mentor("Manipriyan GS","manipriyangopalan@gmail.com");

        User user = new Mentor();

        user.fun(); // Run Time Polymorphism.

        //Child class attrs can't be accessed via Parent class reference.
        // user.company = "Google";

        // ((Mentor) user).company = "Google";

    }
}
