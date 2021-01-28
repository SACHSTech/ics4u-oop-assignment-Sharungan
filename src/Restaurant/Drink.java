import Food.*;

public class Drink extends Food{
  private String Type;
   

  public Drink(String title, int cals, double cost, String temp){
    super(title, cals, cost);
    this.Type = temp;
  }
  public String getType(){
    return Type;
  }



}