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
  public int getSubtotal(){
    return Subtotal;
  }
  public int getTax(){
    return Tax;
  }
  public int getTotal(){
    return Total; 
  }
}
