public class booleanMethod {
    public static void main(String[] arg){
    //prints out if number is even or not
        System.out.println("IS number 20 ? : "+isEven(20));
        System.out.println("IS number 11 ? : "+isEven(11));
        System.out.println("IS number 0 ? : "+isEven(0));
    }
    //Method that returns true if even or returns false
    public static boolean isEven(int number){
        if(number % 2 == 0)
            return true;
        return false;
    }
}
