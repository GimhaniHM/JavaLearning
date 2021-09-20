public class methods {
    public static void main(String[] args){

        //call greet method
        System.out.println(greet("Denny"));

        //or
        String result = greet("Diya");
        System.out.println("\n"+result);

        System.out.println(greet("John"));
        System.out.println(greet("Sofi"));
        System.out.println(greet("Natash"));

    }

    //Method called greet that does return the string
    public static String greet(String name){
        return "Hello, "+name+" Welcome to Java Class . ";
    }

}
