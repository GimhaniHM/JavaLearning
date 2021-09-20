package StringPackage;

import java.util.Locale;

public class StringMethod2 {
    public static void main(String[] arg){
        String str1 = "Hello Students.";
        String str2 = "welcome";
        String str3 = "TeSt";
        String str4 = "Java";
        String str5 = "     string      ";
        int totalStudents = 50;
        String str6 = "abc, def, ghi";
        String[] strCount = str6.split("\\s+"); //split string with regex(regular) expression base on white space to an array
        System.out.println(str1.concat(str2));  //Append string2 to string 1
        System.out.println(str1.replace('e','a'));  //replace 'e' character with 'a'
        System.out.println(str3.toLowerCase()); //convert string to lowercase
        System.out.println(str4.toUpperCase()); //convert string to uppercase
        System.out.println(str5);
        System.out.println(str5.trim());    //trim white spaces to string
        System.out.println(String.valueOf(totalStudents));  //parse int to string
        System.out.println(strCount.length);    //returns length of string

        //For each loop to print out each word
        for (String s : strCount) {
            System.out.println("Word : "+s);
        }
    }
}
