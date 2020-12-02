
import java.util.Arrays;

 //CarRental class
    public  class CarRental       
    {
        CarRentalContract[] car = new CarRentalContract[1]; //an array of CarRentalContracts
     
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