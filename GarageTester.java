 //GarageTester class
    public  class GarageTester 
    {
        String getExample()
        {
            Truck  MyTruck = new Truck ("Green",false);
            MyTruck.color="Blue";
            MyTruck.hastrailer = false;
            
            Garage MyGara = new Garage();
            return MyGara.setVehicle(MyTruck);
            
        }
        
    }
   