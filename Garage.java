    //Garage class
    public  class Garage 
    {
        Vehicle MyVC = new Car("Red",true); // use Vehicle class as instance varible in Garage class
        Vehicle MyVT = new Truck("White",true);
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