package Inheritance;

public class Exec {
    public static void main(String[] args) {
        Car myCar = new Car();
        Vehicle myVehicle = new Vehicle();
        myCar.setName("N20");
        System.out.println("The name of my car is: " + myCar.getName());
        System.out.println("The brand of the vehicle is: " + myVehicle.brand);
    }
}
