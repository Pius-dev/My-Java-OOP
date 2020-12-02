
public class ThMainTester{



 public static void main(String[] args) {
        //int numberOfContracts = 0;
        Vehicle bencar = new Car("Green",true);
        Vehicle petetruck = new Truck("Orange",true);
        
        
        System.out.println(bencar.toString());
        System.out.println(petetruck.toString());
        
        Car MyCa = new Car("Red",true);
        System.out.println("My car : "+MyCa.toString());
        Vehicle piCar = new Car("Purple",true);
        
         Customer Customer1 = new Customer("Pius Obonyo","Tororo");
        Customer Customer2 = new Customer("Birungi","Wakiso");
        
        
        Truck MyTru = new Truck("Green",false);
        System.out.println("My truck : "+MyTru.toString());
       
        GarageTester MyGTester = new GarageTester();
        System.out.println("The garageTester: "+MyGTester.getExample());
         
        CarRentalContract Cust = new CarRentalContract(Customer2,piCar);    
        CarRental MyCarRental = new CarRental();
        
        MyCarRental.addContract(Cust);
        System.out.println("My Contracts:"+MyCarRental.displayContracts()+"\n");

 }
}