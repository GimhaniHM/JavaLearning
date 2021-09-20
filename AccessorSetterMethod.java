class car{
    String make;
    String model;
    int year;

    //Constructor method with parameters
    public car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Gettter Method
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //Setter Method
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    //Instance Method
    public void start(){
        System.out.println("Starting");
    }
}

public class AccessorSetterMethod {
    public static void main(String[] arg){
        //create car object
        car toyota = new car("Toyota","RAV4",2015);

        System.out.println("Car make is : "+toyota.getMake());
        System.out.println("Car model is : "+toyota.getModel());
        System.out.println("Car year is : "+toyota.getYear());
        System.out.println();

        //Use setter method to set new value
        toyota.setMake("Toyota");
        toyota.setModel("Prius V");
        toyota.setYear(2021);

        //Use getter method to get the value
        System.out.println("Car make is : "+toyota.getMake());
        System.out.println("Car model is : "+toyota.getModel());
        System.out.println("Car year is : "+toyota.getYear());

        //Starting
        toyota.start();
    }
}
