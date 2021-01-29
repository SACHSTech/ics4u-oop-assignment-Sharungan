package restaurant;
import restaurant.*;

public class Drink extends Food{
  private String Type;
   
  //Contructor
  public Drink(String title, int cals, double cost, String temp){
    //super
    super(title, cals, cost);
    this.Type = temp;
  }
  //getter
  public String getType(){
    return Type;
  }
}