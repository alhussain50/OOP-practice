public class Vehicle{
    int quantity = 5;
    static void Car(){
        System.out.println("This is a static car");
    }

    public void Bus(){
        System.out.println("This is a public bus");
    }

    public static void main(String[] args) {
        Car();
        Vehicle vehicle = new Vehicle();    
        vehicle.Bus();
        System.out.println(vehicle.quantity);
    }
}
