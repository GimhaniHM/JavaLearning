public class Vehicle {
    String make;
    String model;
    int year;

    //Constructor method passing the parameters
    public Vehicle(String make,String model,int year){
        //this keyword is to eliminate the confusion between class attributes and parameters with the same name
        this.make = make;   //the current object in a method or constructor
        this.model = model;
        this.year = year;

        System.out.println("Vehicle made by : "+make+"\nVehicle Model : "+model+"\nMade Year : "+year);
    }
    /*public Vehicle(String VehicleMake,String VehicleModel,int VehicleYear){
        //this keyword is to eliminate the confusion between class attributes and parameters with the same name
        make = VehicleMake;   //the current object in a method or constructor
        model = VehicleModel;
        year = VehicleYear;
    }*/

    //Instance method
    public void start(){
        System.out.println("I'm starting");
    }
}
