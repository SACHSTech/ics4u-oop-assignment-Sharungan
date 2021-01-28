import java.util.ArrayList;

public class Submenu{
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
}
  