package restaurant;
import restaurant.*;

import java.util.ArrayList;
//import Food.java;
//import Drink.java; 

public class Submenu extends Menu{
  //variables 
  private ArrayList<Food> foodMenu;
  private ArrayList<Drink> drinkMenu;
  private String sub;

  //Array lists
  public Submenu(String name){
    sub = name;
    foodMenu = new ArrayList<Food>();
    drinkMenu = new ArrayList<Drink>();
  } 
  //Adding items to my array list

  /**
  * Method to add items to array list
  * @param newFood
  * @return void
  * @author: S. Umaipalan
  */
  public void addFood(Food newFood){
      foodMenu.add(newFood);
  }
  /**
  * Method to add items to array list 
  * @param newDrink
  * @return void
  * @author: S. Umaipalan
  */
  public void addDrink(Drink newDrink){
    drinkMenu.add(newDrink);
  }
  //Method to return Food options

  /**
  * Method to return a string variables 
  * @param getoptionFood
  * @return optionFood
  * @author: S. Umaipalan
  */
  public String getoptionFood(){
    String optionFood = "";
    for(int i = 0; foodMenu.size() > i; i++){
      optionFood = optionFood + "" + foodMenu.get(i).getName() + "," + " " + foodMenu.get(i).getCalories() + " cals, $" + foodMenu.get(i).getPrice()  + "\r\n";
    }
    return optionFood;
  }
  //Method to return Drink options 

  /**
  * Method to return a string variables 
  * @param getoptionDrink
  * @return optionDrink
  * @author: S. Umaipalan
  */
  public String getoptionDrink(){
    String optionDrink = "";
     for(int i = 0; drinkMenu.size() > i; i++){

      optionDrink = optionDrink + "" + drinkMenu.get(i).getName() + "," + " " + drinkMenu.get(i).getCalories() + " cals," + " $" + drinkMenu.get(i).getPrice() + ", " + drinkMenu.get(i).getType() + "\r\n";
    }
    return optionDrink;  
  }
}
  