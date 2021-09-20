public class ConstantsVariables {
    public static String name;
    public static final double PI = 3.14;   //constant variable
}

class ConstantMethod{
    public static void main(String[]  arg){
        ConstantsVariables.name = "Daniel";
        System.out.println(ConstantsVariables.name);
        System.out.println(ConstantsVariables.PI);
    }
}
