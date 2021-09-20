class AutoMobile{
    String make;
    String model;
    int year;

    //Constructor Method
    public AutoMobile(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Getter Method
    public String GetMake(){
        return make;
    }
    //Getter Method
    public String GetModel(){
        return model;
    }//Getter Method
    public int GetYear(){
        return year;
    }

    //Instance Method
    public void Start(){
        System.out.println("Starting");
    }
}



public class AccessAutoMobileGetterMethod {
    public static void main(String[] arg){
        //create an object of AutoMoblie
        AutoMobile toyota = new AutoMobile("Toyota","RAV4",2015);

        //Use Getter methods to get the value
        System.out.println("Car make is : "+toyota.GetMake());
        System.out.println("Car model is : "+toyota.GetModel());
        System.out.println("Car year is : "+toyota.GetYear());

        //Starting
        toyota.Start();
    }
}
