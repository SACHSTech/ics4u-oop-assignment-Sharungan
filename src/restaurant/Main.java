package restaurant;
import restaurant.*;
import java.io.*;

public class Main{
  public static void main(String[] args){

    Food english_muffin = new Food("english muffin", 250, 2.50);
    Food ham_cheese_sandwich = new Food("ham and cheese sandwich", 270, 2.50);
    Food egg_sandwich = new Food("egg sandwich", 269, 2.50);
    Food swedish_blueberry_soup = new Food("swedish blueberry soup", 200, 1.50); 
    Food finnish_christmas_porridge = new Food("finnish christmas porridge", 190, 1.50);
    Food pho_ga = new Food("pho ga", 350, 2.00);
    Drink coffee = new Drink("coffee", 0 , 1.50, "hot");
    Drink tea = new Drink("tea", 0 , 1.50, "hot");
    Drink french_vanilla = new Drink("french vanilla", 2, 1.50,"hot");
    Drink ice_coffee = new Drink("ice coffee", 1, 1.50, "cold");
    Drink chocolate_milk = new Drink("chocolate milk", 0, 1.50, "cold");
    Drink orange_juice = new Drink("orange juice", 0, 1.50, "cold");
    Food blt = new Food("blt", 270, 3.50);
    Food spinach_feta_sandwich = new Food("spinach and feta sandwich", 270, 3.50);
    Food roast_sandwich = new Food("roast beef sandwich",350, 3.50); 
    Food chicken_soup = new Food("chicken soup", 170, 2.50);
    Food tomato_soup = new Food("tomato soup", 120, 2.50);
    Food cream_broccoli_soup = new Food("cream of broccoli soup", 110, 2.50); 
    Drink hot_cocoa = new Drink("hot cocoa", 0, 1.50,"hot");
    Drink chai = new Drink("chai", 0, 1.50, "hot");
    Drink soda = new Drink("soda", 5, 1.50, "cold");
    Drink ice_tea = new Drink("ice tea", 2, 1.50, "cold");
    Drink smoothie = new Drink("smoothie", 0, 1.50, "cold");
    Food italian_sausage_sandwich = new Food("italian sausage sandwich", 450, 3.50);
    Food chicken_caesar_sandwich = new Food("chicken caesar sandwich", 430, 3.50);
    Food turkey_panini = new Food("turkey panini", 410, 3.50);
    Food french_soup = new Food("french onion soup", 150, 3.50);
    Food lentil_soup = new Food("lentil soup", 100, 3.50);
    Food italian_meatball_soup = new Food("italian meatball soup", 200, 3.50);
    Drink wine = new Drink("red wine", 85, 5.00, "cold");
    Drink beer = new Drink ("beer", 43, 5.00, "cold");
    Drink kombucha = new Drink("kombucha", 30, 5.00, "cold");
    Drink hong_kong_style_milk_tea = new Drink("hong kong style milk tea", 20, 5.00, "warm");
    Drink amazake = new Drink("amazake", 30, 5.00, "hot");
    Drink ginger_tea = new Drink("ginger tea", 2, 5.00, "hot");
    Food pb_j = new Food("peanutbutter and jelly sandwich", 100, 1.00);
    Food payasam = new Food("payasam", 50, 1.00);
    Drink halohalo = new Drink("halo halo", 153, 1.00, "cold");
    Drink peppermint_mocha_latte = new Drink("peppermint mocha latte", 120, 1.00, "hot");

    Submenu breakfastMenu = new Submenu("breakfastMenu");
    breakfastMenu.addFood(egg_sandwich);  
    breakfastMenu.addFood(english_muffin);
    breakfastMenu.addFood(ham_cheese_sandwich);
    breakfastMenu.addFood(swedish_blueberry_soup);
    breakfastMenu.addFood(finnish_christmas_porridge);
    breakfastMenu.addFood(pho_ga);
    breakfastMenu.addDrink(coffee);
    breakfastMenu.addDrink(tea);
    breakfastMenu.addDrink(french_vanilla);
    breakfastMenu.addDrink(ice_coffee);
    breakfastMenu.addDrink(chocolate_milk);
    breakfastMenu.addDrink(orange_juice);
    Submenu lunchMenu = new Submenu("lunchMenu");
    lunchMenu.addFood(blt);
    lunchMenu.addFood(spinach_feta_sandwich);
    lunchMenu.addFood(roast_sandwich);
    lunchMenu.addFood(tomato_soup);
    lunchMenu.addFood(chicken_soup);
    lunchMenu.addFood(cream_broccoli_soup);
    lunchMenu.addDrink(soda);
    lunchMenu.addDrink(smoothie);
    lunchMenu.addDrink(ice_tea);
    lunchMenu.addDrink(coffee);
    lunchMenu.addDrink(hot_cocoa);
    lunchMenu.addDrink(chai);
    Submenu dinnerMenu = new Submenu("dinnerMenu");
    dinnerMenu.addFood(italian_sausage_sandwich);
    dinnerMenu.addFood(chicken_caesar_sandwich);
    dinnerMenu.addFood(turkey_panini);
    dinnerMenu.addFood(french_soup);
    dinnerMenu.addFood(lentil_soup);
    dinnerMenu.addFood(italian_meatball_soup);
    dinnerMenu.addDrink(wine);
    dinnerMenu.addDrink(beer);
    dinnerMenu.addDrink(kombucha);
    dinnerMenu.addDrink(hong_kong_style_milk_tea);
    dinnerMenu.addDrink(amazake);
    dinnerMenu.addDrink(ginger_tea); 
    Submenu specialsMenu = new Submenu("specialsMenu");
    specialsMenu.addFood(pb_j);
    specialsMenu.addFood(payasam);
    specialsMenu.addDrink(peppermint_mocha_latte);
    specialsMenu.addDrink(halohalo);
    
    System.out.println(breakfastMenu.getoptionFood());
    System.out.println(breakfastMenu.getoptionDrink());
    System.out.println(lunchMenu.getoptionFood());
    System.out.println(lunchMenu.getoptionDrink());
    System.out.println(dinnerMenu.getoptionFood());
    System.out.println(dinnerMenu.getoptionDrink());
    System.out.println(specialsMenu.getoptionFood());
    System.out.println(specialsMenu.getoptionDrink());

  }
} 


