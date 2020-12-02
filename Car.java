public  class Car extends Vehicle
    {
 boolean wintertires = false;
 Car(String carcolor,boolean hasWint){
        
        this.color = carcolor;
        wintertires = hasWint;
    }
 
          public String toString() //b is another line with the content: has winter tires: true/false, depending on the actual value.
    {
              
              return "This vehicle is " +color+","+ "has winter tires: "+wintertires;
       
    }
    
    }