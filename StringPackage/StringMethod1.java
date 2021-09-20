package StringPackage;

public class StringMethod1 {
    public static void main(String[] arg){
        String str1 = "Hello Students" + "Welcome to Java world";
        String str2 = "Welcome";
        String str3 = " ";
        System.out.println(str1.length());  //gives length of the string
        System.out.println(str1.substring(1));  //will return string after 1 index
        System.out.println(str1.substring(6,13));   //will return string between 6 and 13(from 7 to 13)
        System.out.println(str1.contains("Hello")); //returns true if str1 contains Hello
        System.out.println(str2.equals("welcome")); //returns true/false if str2 eqauls Hello
        System.out.println(str2.equalsIgnoreCase("welCome"));   //returns true/false if str2 equals welcome ignoring uppercase/lowercase characters
        System.out.println(str3.isEmpty()); //return true is str3 is empty

    }
}
