public class SwitchCase {
    public static void main(String[] args){
        String grade = "C+";
        switch(grade){
            case "A+" :
                System.out.println("Awesome student");
                break;
            case "A":
                System.out.println("Awesome student");
                break;
            case "A-" :
                System.out.println("Great student");
                break;
            case "B+" :
                System.out.println("Good student");
                break;
            case "B" :
                System.out.println("Good student");
                break;
            case "B-" :
                System.out.println("Good student");
                break;
            case "C+" :
                System.out.println("poor student");
                break;
            case "C" :
                System.out.println("Very poor student");
                break;
            default :
                System.out.println("Failed student");
                break;
        }

    }
}
