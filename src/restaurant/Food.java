package restaurant;
import restaurant.*;

public class Food{
  //varibles 
  private String Name;
  private int Calories;
  private double Price; 
  
  //Contructor
  public Food(String title, int cals, double cost){
    this.Name = title;
    this.Calories = cals;
    this.Price = cost;
  }
  //getters
  public String getName(){
    return Name;
  }
  public int getCalories(){
    return Calories;
  }
  public double getPrice(){
    return Price;
  }
}