package restaurant;
import restaurant.*;

public class Customer{
  private String Name;
  private String Order;

  public Customer(String name, String order){
    this.Name = name;
    this.Order = order; 
  }
  public String getName(){
    return Name;
  }
  public String getOrder(){
    return Order; 
  }
}
