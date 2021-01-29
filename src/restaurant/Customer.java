package restaurant;
import restaurant.*;

public class Customer{

  //Variables 
  private String Name;
  private String Order;

  //Contructors
  public Customer(String name, String order){
    this.Name = name;
    this.Order = order; 
  }
  //getters
  public String getName(){
    return Name;
  }
  public String getOrder(){
    return Order; 
  }
}
