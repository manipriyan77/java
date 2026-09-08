//Create a Student class satisfying following requirements
//
//        It should have two data members:
//age: int
//name: String
//It should have a display method
//Signature : void:display()
//It should print : “My name is <name>. I am <age> years old”
//It should have a sayHello method
//Signature : void:sayHello(String)
//It should print : “<name data member> says hello to <name parameter>”

package oops.lecture1.assignments;

public class Problem1 {
    int age = 28;
    String name = "Manipriyan GS";

    public  String display(){
        return "My name is " + name+". "+"I am " +age+" years old";
    }

    public void sayHello(String userName){
        System.out.println(name+" says hello to "+userName);
    }

}
