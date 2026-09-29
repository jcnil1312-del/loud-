
class Calculator{
//Function overloading
// method 1 : add two integers
    int add (int a , int b)
    {
        return a + b;
    }
    // Method 2: Add three integers
    int add (int a ,int b, int c )
    {
        return a+b+c;
    }
    // method 3 : add two double values
    double add(double a ,double b)
    {
        return a + b;
    }
}
// Class demonstrating Constructors and Returning by reference
class Student {
    String name ;
    int age;
//default Constructor
    Student(){
        name = "Unknown";
        age = 0;
    }
//Parameterized Constructor
    Student(String n, int a)
    {
        name = n;
        age = a;
    }
    //Copy constructor
    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }
    //method to display student details
    void display(){
        System.out.println("Name:" + name + ",Age:" + age);
    }
    //Method returning reference to current object
    Student getStudent(){
        return this;
    }
}
public class FunctionDemo{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Add two integers:" + calc.add(5,10));
        System.out.println("Add three integers:" + calc.add(5,10,15));
        System.out.println("Add two doubles:" + calc.add(5.5,4.5));

        //constructors
        Student s1 = new Student();
        Student s2 = new Student("Nitin", 22);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        //returning by reference
        Student s4 = s2.getStudent();
        System.out.println("Student s4 details (reference to s2):");
        s4.display();
    }
}