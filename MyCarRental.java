
package CarRental;


import java.util.Arrays;

/**
 *
 * @author Personal
 */
public class MyCarRental{
    
//Vehicle class
public class Vehicle {
    
    String color = "Black";
   
    public String getColor()
    {
        return color;
    }
    public String toString( ) //a is a String like This vehicle is red, depending on the actual color
    {
       
        return "This vehicle is " + color;  
    }
}
    //Car class
    public static class Car extends Vehicle
    {
 boolean wintertires = false;
 
          public String toString() //b is another line with the content: has winter tires: true/false, depending on the actual value.
    {
              
              return "This vehicle is " +color+","+ "has winter tires: "+wintertires;
       
    }
    
    }
    
    //Truck class
    public static class Truck extends Vehicle      
    {
        boolean hastrailer = false;
               public String toString() //'c' adds another line with the content: has trailer: true/false, depending on the actual value.
    {
                   
        return "This vehicle is " +color + ","+"has trailer: " +hastrailer;
    }
               
    }
    
    //Garage class
    public static class Garage 
    {
        Vehicle MyVC = new Car(); // use Vehicle class as instance varible in Garage class
        Vehicle MyVT = new Truck();
       public String setVehicle(Vehicle parked)
        {
            return parked.toString();
        }
         public String toString(String MyVT, String MyVC) // //Description of the parked car
    {
        return MyVC + MyVT;
    }
        //Description of the parked 
        
    }
    
    //GarageTester class
    public static class GarageTester 
    {
        String getExample()
        {
            Truck  MyTruck = new Truck ();
            MyTruck.color="Blue";
            MyTruck.hastrailer = false;
            
            Garage MyGara = new Garage();
            return MyGara.setVehicle(MyTruck);
            
        }
        
    }
    
    //Customer clas
    public static class Customer 
    {
        String name ;
        String address;
        
    }
    
    //CarRentalContract
    public static class CarRentalContract
    {
         Vehicle MyCa = new Car();
         Customer MyCus = new Customer();
    
    CarRentalContract(String name,String address)
    {
        MyCus.name =name;
        MyCus.address =address;
    }
         //@Override
      public String toString() // //Description of the parked car
    {
        return MyCus.name + MyCa.toString();
    }       
    
    }
    //CarRental class
    public static class CarRental       
    {
        CarRentalContract[] car = new CarRentalContract[1]; //an array of CarRentalContracts
       // String car[] = new String[50];
       public CarRentalContract addContract(CarRentalContract c1)
        {
            for(int i=0;i<car.length; i++) {
                car[i]=c1;
                 //car[i]=c1.toString();
            }
            return c1;
        }
      public String toString(String customername, String vehicledescription)
        {           
            return customername + vehicledescription;
        }
        
        String displayContracts()
        {
           String m="No car Rental Contract Available";
            for (CarRentalContract disp  : car){
               //System.out.println("The car rentalContract is "+Arrays.toString(car));
               return Arrays.toString(car);
               // return disp.toString();
            }
       
          return m;
        }

    
  
    }

 public static void main(String[] args) {
        int numberOfContracts = 0;
        
        Car MyCa = new Car();
        System.out.println("My car : "+MyCa.toString());
        
        Truck MyTru = new Truck();
        System.out.println("My truck : "+MyTru.toString());
       
        GarageTester MyGTester = new GarageTester();
        System.out.println("The garageTester: "+MyGTester.getExample());
         
        CarRentalContract c2 = new CarRentalContract("Pius Obonyo", "Tororo");    
        CarRental MyCarRental = new CarRental();
        
        MyCarRental.addContract(c2);
        System.out.println("My Contracts:"+MyCarRental.displayContracts()+"\n");

 }
 
}
