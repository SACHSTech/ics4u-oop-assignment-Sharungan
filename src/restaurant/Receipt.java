package restaurant;
import restaurant.*;

public class Receipt{
  
  //Variables 
  private double subtotal;

  //Contructor
  public Receipt(double sub){
    this.subtotal = sub;
  }

  //Getters
  
  /**
  * Method to return a int variable 
  * @param getSubtotal
  * @return Subtotal
  * @author: S. Umaipalan
  */
  public double getsubtotal(){
    return subtotal;
  }
  /**
  * Method to return a int variable 
  * @param gettotal
  * @return total
  * @author: S. Umaipalan
  */
  public double gettotal(){
    double total = this.subtotal * 1.13;
    return total; 
  }
  /**
  * Method to change subtotal to string 
  * @param toString
  * @return String.valueOf(subtotal)
  * @author: S. Umaipalan
  */
  public String toString(){
    return String.valueOf(subtotal);
  }  
}
