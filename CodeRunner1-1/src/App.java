public class App {
    public static void main(String[] args) throws Exception {
        car olio1 = new car();
    }
} // Main loppu
class car{
    public String brand;
    public String model;
    public int amountOfFuel;
    
    public void brake(){
        System.out.println("The car is breaking");
    }

    public void accelerate(){
        amountOfFuel --;
        if(amountOfFuel > 0){
            System.out.println("Car is accelerating");
        }
    }

    public void printData(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }
}