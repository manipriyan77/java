package oops.lecture1;

public class Main {
    static void main() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student1;
        System.out.println(student1+" "+student2);
        System.out.println(student1+" "+student3);
    }
}
