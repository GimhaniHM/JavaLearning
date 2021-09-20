public class addMethod {
    public static void main(String[] arg){
        int num1 = 52;
        int num2 = 100;

        double sum = add(num1,num2);
        System.out.println("Summation : "+sum);     //sum(num1,num2);
        System.out.println("Summation : "+add(102,405));
        System.out.println("Summation : "+add(45,31));
    }
    public static double add(int x,int y){
        double total = x+y; //return x+y;
        return total;
    }
}
