package InnerClass;

public class Bangladesh{
    int area = 147570; 
    public class Dhaka{
        int area = 305;
    }

    public static void main(String args[]){
        Bangladesh objBangladesh = new Bangladesh();
        Bangladesh.Dhaka objDhaka = objBangladesh.new Dhaka();
        System.out.println("The area of Bangladesh is: " + objBangladesh.area);
        System.out.println("The are of Dhaka is: " + objDhaka.area); 
    }
}
