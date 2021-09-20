public class staticMethod {
    public static void main(String[] arg){
        //call static method
        name_of_dog("Husky");
        bark();
    }
    //static method to get name of dog
    public static void name_of_dog(String name){
        System.out.println("Name is : "+name);
    }

    //static method that calls bark() method
    public static void bark(){
        System.out.println("I'm barking");
    }

    //none static method
    //public void sleep(){
       // System.out.println("I'm sleeping");

   // }
}


