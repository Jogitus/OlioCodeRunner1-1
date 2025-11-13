public class App {
    public static void main(String[] args) throws Exception {
Car car = new Car("Opel","Astra",50);
car.setModel("Corsa");
System.out.println(car.getModel());
car.refuel(5);
}
}// Main loppu
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
/* Harjoitus 2
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
*/
/* Harjoitus 3
class Car{
    private String brand;

    private String model;
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    private int amountOfFuel;

    public Car(String b, String m, int aOF){ // Parameterized
        brand = b;
        model = m;
        amountOfFuel = aOF;
        printData();
    }
    public Car(){ // Parameterless
    brand = "";
    model = "";
    amountOfFuel = 0;
    }

    private void printData(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }
}
*/
/* Harjoitus 4
class Car{
    private String brand;

    private String model;
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    private int amountOfFuel;

    public Car(String b, String m, int aOF){ // Parameterized
        brand = b;
        model = m;
        amountOfFuel = aOF;
        printData();
    }
    public Car(){ // Parameterless
    brand = "";
    model = "";
    amountOfFuel = 0;
    }

    private void printData(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }

    public void refuel(int refuel){
        int afterrefuel = amountOfFuel + refuel;
        System.out.println("Fuel in the tank: " + amountOfFuel);
        System.out.println("Refuel: " + refuel);
        System.out.println("Fuel in the tank after the refuel: " + afterrefuel);
        
    }
}
*/