import Restaurant.*;

public class Main{
  public static void main(Strings[] args){

    Food roast_sandwich = new Food("roast beef sandwich",1000, 5.00);
    Food english_muffin = new Food("english muffin", 250, 2.50);
    
    Food egg_sandwich = new Food("egg sandwich", 269, 2.50);
    Food chicken_soup = new Food("chicken soup", 200, 3.50);
    Food tomato_soup = new Food("tomato soup", 200, 4.50);
    Drink drink = new Drink("coffee",100, 1.50, "hot");
    
    
    Submenu breakfastMenu = new Submenu("breakfastMenu");
    breakfastMenu.addFood(tomato_soup);  
    breakfastMenu.addFood(); 
    
  }
} 


