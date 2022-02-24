public class Transport {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed){
        System.out.println("The maximum speed is " + maxSpeed);
    }

    public static void main(String args[]){
        Transport myCar = new Transport();
        myCar.fullThrottle();
        myCar.speed(150);
    }
}
