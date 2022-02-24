public class Bird {

    String birdName;

    public Bird(String name){
        birdName = name;
    }

    public static void main(String args[]){
        Bird raven = new Bird("raven");
        System.out.print(raven.birdName);
    }
}
