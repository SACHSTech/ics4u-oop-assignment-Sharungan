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
  * Method to return a int variable 
  * @param getCalories
  * @return Calories
  * @author: S. Umaipalan
  */
  public int getCalories(){
    return Calories;
  }
  /**
  * Method to return a double variable 
  * @param getPrice
  * @return Price
  * @author: S. Umaipalan
  */
  public double getPrice(){
    return Price;
  }
}