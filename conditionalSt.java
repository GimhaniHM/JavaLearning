public class conditionalSt {
    public static void main(String[] arg){
        double grade = 2.5;

        if(grade == 4.0){
            System.out.println("\nYou're awesome student!");
        }else if(grade >= 3.5 && grade < 4.0){
            System.out.println("\nYou are A grade student");
        }else if(grade >= 3 && grade < 3.5){
            System.out.println("\nYou are B grade student");
        }else if(grade >= 2.5 && grade < 3.0){
            System.out.println("\nYou are poor student");
        }
    }
}
