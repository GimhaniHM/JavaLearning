public class Class {
    public static void main(String[] arg){
        //1st dog(object of class)
        name_of_dog("hound");
        bark();
        sleep();
        eat();
        play();

        System.out.println("\n");
        //2nd dog(object of class)
        name_of_dog("Husky");
        bark();
        sleep();
        eat();
        play();

    }
    public static void name_of_dog(String name){
        System.out.println("Name : "+name);
    }
    public static void bark(){
        System.out.println("I'm barking");
    }
    public static void sleep(){
        System.out.println("I'm sleeping");
    }
    public static void eat(){
        System.out.println("I'm eating");
    }
    public static void play(){
        System.out.println("I'm playing");
    }
}

