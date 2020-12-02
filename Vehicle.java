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
