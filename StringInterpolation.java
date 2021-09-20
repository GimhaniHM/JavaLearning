public class StringInterpolation {
    public static void main(String[] arg){
        String custName = "Kevin";
        String streetName = "4123 California Avenue";
        int age = 32;
        String city = "Los Angeles";
        String state = "Califonia";
        String zipcode = "90012";
        String country = "United States";

        //No String Interpolation
        System.out.println("Customer Name : "+custName+" , Street Name : "+streetName+" , Age: "+age+ " , City : "+city+" , State : "+state+" , Zipcode : "+zipcode+ " , Country : "+country);

        System.out.println("\n");

        //String Interpolation
        System.out.println(String.format("Customer Name : %s\nStreet Name : %s\nAge : %d\nCity : %s\nState : %s\nZipcode : %s\nCountry : %s"
        ,custName,streetName,age,city,state,zipcode,country));
    }
}
