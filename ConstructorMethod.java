public class ConstructorMethod {
    //Constructor Method
    public ConstructorMethod(){
        System.out.println("This is Constructor method");
    }

    //ConstructorMethod with p[arameters
    public ConstructorMethod(String param){
        System.out.println("This is Constructor method with parameter "+param);
    }
    public void InstanceMethod(){
        System.out.println("This is instance method");
    }
}
class ConstructorMethodExample{
    public static void main(String[] arg){
        //create object method1 with default constructor
        ConstructorMethod method1 = new ConstructorMethod(); //It will automatically call the ConstructorMethod
         method1.InstanceMethod();

         System.out.println("\n");

        //Create object method2 with constructor having parameter
        ConstructorMethod method2 = new ConstructorMethod("constructor"); //It will automatically call the ConstructorMethod
        method2.InstanceMethod();

        System.out.println("\n");

    }
}
