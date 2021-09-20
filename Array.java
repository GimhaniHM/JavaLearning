public class Array {
    public static void main(String[] arg){
        String[] StudentsName;      //declaration of array
        StudentsName = new String[] {"Gim","Diya","Neshvi","Dev","Karolin"};    //initialization of an array
        int[] age = new int[] {15,20,23,45,50};     //declare and initialization
        double[] studentGrade = new double[] {4.0,3.25,3.0,2,3.5};
        String[] studentSubject = new String[5];
        studentSubject[0] = "Computer Science";
        studentSubject[1] = "Socialogy";
        studentSubject[2] = "History";
        studentSubject[3] = "Zoology";
        studentSubject[4] = "Physical Science";

        System.out.println("******** Student Details *********");

        System.out.println("1 . ");
        System.out.println ("Student Name : "+StudentsName[0]);
        System.out.println("Student Age : "+age[0]);
        System.out.println("Student Grade : "+studentGrade[0]);
        System.out.println("Student Subject : "+studentSubject[0]);

        System.out.println("2 . ");
        System.out.println ("Student Name : "+StudentsName[3]);
        System.out.println("Student Age : "+age[3]);
        System.out.println("Student Grade : "+studentGrade[3]);
        System.out.println("Student Subject : "+studentSubject[3]);

    }

}
