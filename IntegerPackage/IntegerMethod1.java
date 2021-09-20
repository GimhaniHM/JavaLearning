package IntegerPackage;

public class IntegerMethod1 {
    public static void main(String[] arg){
        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;

        System.out.println(a.intValue());   //returns integer value of a
        System.out.println(b.doubleValue());   //returns double value of b
        System.out.println(c.floatValue());   //returns float value of c
        System.out.println(Integer.parseInt("241356"));
        System.out.println(Integer.compare(a,d));   //returns 0 if equals
        System.out.println(Integer.compare(d,b));    //returns 1 if d > b
        System.out.println(Integer.compare(b,a));    //returns -1 if b < a
        System.out.println(a.equals(d));    //returns true if a equals d else returns false
        System.out.println(a.equals(c));
    }
}
