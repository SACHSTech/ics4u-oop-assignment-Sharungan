package restaurant;
import restaurant.*;

public class Receipt{
  
  //Variables 
  private int Subtotal;
  private int Tax;
  private int Total;

  //Contructor
  public Receipt(int sub, int tax, int tot){
    this.Subtotal = sub;
    this.Tax = tax;
    this.Total = tot;
  }

  //Getters
  
  /**
  * Method to return a int variable 
  * @param getSubtotal
  * @return Subtotal
  * @author: S. Umaipalan
  */
  public int getSubtotal(){
    return Subtotal;
  }
  /**
  * Method to return a int variable 
  * @param getTax
  * @return Tax
  * @author: S. Umaipalan
  */
  public int getTax(){
    return Tax;
  }
  /**
  * Method to return a int variable 
  * @param getTotal
  * @return Total
  * @author: S. Umaipalan
  */
  public int getTotal(){
    return Total; 
  }
}
