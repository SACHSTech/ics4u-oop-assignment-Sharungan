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

  /**
  * Method to return a string variable 
  * @param getName
  * @return Name
  * @author: S. Umaipalan
  */
  public String getName(){
    return Name;
  }
  /**
  * Method to return a string variable 
  * @param getOrder
  * @return Order
  * @author: S. Umaipalan
  */
  public String getOrder(){
    return Order; 
  }
}
