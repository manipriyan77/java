package oops.lecture2;

import java.util.Scanner;

public class StudentConstructor {
    public int rollNumber;
    public int age;
    public String name;

    // no-arg constructor
    public StudentConstructor (){}

    public StudentConstructor (String name, int age, int rollNumber){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public void displayStudent () {
        System.out.println("Rollnumber : " + this.rollNumber);
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Enter your RollNumber");
        int roll_number = scanner.nextInt();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        StudentConstructor student = new StudentConstructor(name, age, roll_number);

        System.out.println("Contents of the original object");
        student.displayStudent();

        StudentConstructor student_copy = new StudentConstructor();
        student_copy.rollNumber = student.rollNumber;
        student_copy.age = student.age;
        student_copy.name = student.name;

        System.out.println("Contents of the copied object");
        student.displayStudent();
    }
}
