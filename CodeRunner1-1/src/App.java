public class App {
    public static void main(String[] args) throws Exception {
        car olio1 = new car("Kia", "Rio", 2);

        olio1.accelerate();
        olio1.brake();
        olio1.printData();
    }
} // Main loppu
class car{
    public String brand;
    public String model;
    public int amountOfFuel;
    
    public car(String b, String m, int aOF){
        brand = b;
        model = m;
        amountOfFuel=aOF;
    }
    public void brake(){
        System.out.println("Car is breaking");
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