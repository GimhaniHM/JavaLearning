class Student{
    //Name of the student
    public void name_of_student(String name){
        System.out.println(String.format("Student name : %s",name));
    }

    //Grade of the student
    public void grade(double grade){
        System.out.println(String.format("Student grade : %.2f",grade));
    }

    //static method
    public static void className(String clas_Name){
        System.out.println(String.format("Object name is : %s",clas_Name));
    }
}

public class instanceMethod {
    public static void main(String[] arg){
        //Create student1 object
        Student student1 = new Student();
        student1.name_of_student("Jonny");
        student1.grade(3.25);
        Student.className("Student1");     //static method of student class(another class)-definetly wanted object to call the methods of another class(in same package)

        System.out.println("\n");

        //Create student2 object
        Student student2 = new Student();
        student2.name_of_student("Diya");
        student2.grade(4.0);
        Student.className("Student2");

        System.out.println("\n");

        //Create student3 object
        Student student3 = new Student();
        student3.name_of_student("Kevin");
        student3.grade(2);
        Student.className("Student3");

        System.out.println("\n");
    }
}
