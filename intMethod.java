public class intMethod {
    public static void main(String[] arg){
        System.out.println("your age is : "+findAge(1997));
        System.out.println("your age is : "+findAge(2000));
        System.out.println("your age is : "+findAge(1955));
    }
    //Method that find the lucky number
    public static int findAge(int year){
        int age = 2017-year;
        return age;
    }
}
