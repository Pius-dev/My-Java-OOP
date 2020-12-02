 //Truck class
    public  class Truck extends Vehicle      
    {
        boolean hastrailer = false;
        Truck(String TruckColor,boolean hasTrail){
        this.color = TruckColor;
        hastrailer = hasTrail;
    }
    
        @Override
               public String toString() //'c' adds another line with the content: has trailer: true/false, depending on the actual value.
    {
                   
        return "This vehicle is " +color + ","+"has trailer: " +hastrailer;
    }
               
    }
   