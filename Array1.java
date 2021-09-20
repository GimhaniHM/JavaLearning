public class Array1 {
    public static void main(String[] arg){
        double[] numList = {121.9,456.23,631.85,15.45,63.400};

        //print all the array elemnts
        for(int i=0 ; i<numList.length;i++){
            System.out.println(numList[i]);
        }

        //Summation of all the elements of an array
        double sum=0;
        for(int i=0;i<numList.length;i++){
            sum+=numList[i];    //sum=sum+numList[i];
        }
        System.out.println("Summation : "+sum);

        //maximum element of an array
        double max=numList[0];
        for(int i=0;i<numList.length ; i++){
            if(numList[i]>max)
                max=numList[i];
        }
        System.out.println("Maximum number : "+max);
    }
}
