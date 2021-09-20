class ClassVariable{
    public static String name;  //Static variable name
    static String address;   //Static variable name
}

class StaticClassVariables {
    public static void main(String[] arg){
        ClassVariable.name = "John";    //no need to create an object ,you can just call variable(name) using class name
        ClassVariable.address = "1212 Califonia Avenue,Richmond,VA 22601";
        System.out.println(ClassVariable.name); //Access to name static variable
        System.out.println(ClassVariable.address);  //Access to address static variable
    }
}
