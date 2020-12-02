
    //CarRentalContract
    public  class CarRentalContract
    {
         Vehicle MyCa; //= new Car();
         Customer MyCus;
    
    CarRentalContract(String name,String address)
    {
        MyCus.name =name;
        MyCus.address =address;
    }
      public static int CO = 0; 
    { 
        CO += 1; 
    }

    CarRentalContract(Customer Customer2, Vehicle piCar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public String toString() // //Description of the parked car
    {
        return MyCus.name + MyCa.toString();
    }       
    
    }