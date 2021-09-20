public class forEachLoop {
    public static void main(String[] arg){
        String[] celebrities = {"Bruno Mars","Taylor Swift","Diya Ketran"};

        //For each loop
        for(String name : celebrities){
            System.out.print(name);
            System.out.print(",");
        }
        System.out.println("\n");

        int[] age = {45,15,23};
        for(int x : age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
