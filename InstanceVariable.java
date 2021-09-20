class Employee{
    //Instance variables
    public String name; //public variable that is visible for any child class
    private int age;    //private variable that is visible for Employee class only

    //constructor method
    public Employee(String name){
        this.name = name;
    }

    //setter method
    public void setAge(int age){
        this.age = age;
    }

    //Display Employee Info
    public void displayEmployeeInfo(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
public class InstanceVariable {
    //Instance variable
    //Instance variables
    public String name; //public variable that is visible for any child class
    private int age;    //private variable that is visible for Employee class only

    //constructor method
    public InstanceVariable(String name){
        this.name = name;
    }

    //setter method
    public void setAge(int age){
        this.age = age;
    }

    //Display Employee Info
    public void displayInfo(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
    public static void main(String[] arg){
        Employee e1 = new Employee("Diya Ketran");
        e1.setAge(55);
        e1.displayEmployeeInfo();

        System.out.println();

        InstanceVariable Iv1 = new InstanceVariable("Andera Smith");
        Iv1.setAge(23);
        Iv1.displayInfo();
    }
}
