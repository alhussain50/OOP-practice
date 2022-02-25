package PrivateInner;

public class Country{
    public void area(){
        System.out.println("The area of this country is: x square km");
    }

    private class Bangladesh{
        int area = 147570;
    }

    public static void main(String args[]){
        Country objCountry = new Country();
        objCountry.area();

        Country.Bangladesh objBangladesh = objCountry.new Bangladesh();
        System.out.println("The area of this country is: " + objBangladesh.area);
    }
    
}