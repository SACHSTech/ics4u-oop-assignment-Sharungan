package restaurant;
import restaurant.*;

import java.util.ArrayList;
//import Food.java;
//import Drink.java; 

public class Submenu extends Menu{
  private ArrayList<Food> foodMenu;
  private ArrayList<Drink> drinkMenu;
  private String sub;

  public Submenu(String name){
    sub = name;
    foodMenu = new ArrayList<Food>();
    drinkMenu = new ArrayList<Drink>();
  } 
  public void addFood(Food newFood){
      foodMenu.add(newFood);
  }
  public void addDrink(Drink newDrink){
    drinkMenu.add(newDrink);
  }
  public String getoptionFood(){
    String optionFood = " ";
    for(int i = 0; foodMenu.size() > i; i++){
      optionFood = optionFood + " " + foodMenu.get(i).getName() + "," + " " + foodMenu.get(i).getCalories() + "," + " " + foodMenu.get(i).getPrice() + ", ";
    }
    return optionFood;
  }
  public String getoptionDrink(){
    String optionDrink = " ";
     for(int i = 0; drinkMenu.size() > i; i++){

      optionDrink = optionDrink + " " + drinkMenu.get(i).getName() + "," + " " + drinkMenu.get(i).getCalories() + "," + " " + drinkMenu.get(i).getPrice() + " " + drinkMenu.get(i).getType() + ", ";
    }
    return optionDrink;  
  }
}
  