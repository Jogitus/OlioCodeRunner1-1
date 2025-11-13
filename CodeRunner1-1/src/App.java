public class App {
    public static void main(String[] args) throws Exception {
        Car olio1 = new Car("Kia", "Rio", 2);

        olio1.accelerate();
        olio1.brake();
        olio1.printData();
    }
} // Main loppu
/* Harjoitus 1
class Car{
    public String brand;
    public String model;
    public int amountOfFuel;
    
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
*/
class Car{
    public String brand;
    public String model;
    public int amountOfFuel;
    
    public Car(){ // Parameterless
    brand = "";
    model = "";
    amountOfFuel = 0;
    }

    public Car(String b, String m, int aOF){ // Parameterized
        brand = b;
        model = m;
        amountOfFuel = aOF;
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