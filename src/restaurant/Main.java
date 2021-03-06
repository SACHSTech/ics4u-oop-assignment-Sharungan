package restaurant;
import restaurant.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Created instances for Food and Drink
    Food english_muffin = new Food("english muffin", 250, 2.50);
    Food swedish_blueberry_soup = new Food("swedish blueberry soup", 200, 1.50); 
    Drink coffee = new Drink("coffee", 0 , 1.50, "hot");
    Drink ice_coffee = new Drink("ice coffee", 1, 1.50, "cold");
    Food blt = new Food("blt", 270, 3.50);
    Food tomato_soup = new Food("tomato soup", 120, 2.50);
    Drink chai = new Drink("chai", 0, 1.50, "hot");
    Drink soda = new Drink("soda", 5, 1.50, "cold");
    Food turkey_panini = new Food("turkey panini", 410, 3.50);
    Food french_soup = new Food("french onion soup", 150, 3.50);
    Drink wine = new Drink("red wine", 85, 5.00, "cold");
    Drink hong_kong_style_milk_tea = new Drink("hong kong style milk tea", 20, 5.00, "warm");
    Food pb_j = new Food("peanutbutter and jelly sandwich", 100, 1.00);
    Food payasam = new Food("payasam", 50, 1.00);
    Drink halohalo = new Drink("halo halo", 153, 1.00, "cold");
    Drink peppermint_mocha_latte = new Drink("peppermint mocha latte", 120, 1.00, "hot");

    //Created Submenu instances
    Submenu breakfastMenu = new Submenu("breakfastMenu");

    breakfastMenu.addFood(english_muffin);
    breakfastMenu.addFood(swedish_blueberry_soup);
    breakfastMenu.addDrink(coffee);
    breakfastMenu.addDrink(ice_coffee);
    Submenu lunchMenu = new Submenu("lunchMenu");
    lunchMenu.addFood(blt);
    lunchMenu.addFood(tomato_soup);
    lunchMenu.addDrink(soda);
    lunchMenu.addDrink(chai);
    Submenu dinnerMenu = new Submenu("dinnerMenu");
    dinnerMenu.addFood(turkey_panini);
    dinnerMenu.addFood(french_soup);
    dinnerMenu.addDrink(wine);
    dinnerMenu.addDrink(hong_kong_style_milk_tea);
 
    Submenu specialsMenu = new Submenu("specialsMenu");
    specialsMenu.addFood(pb_j);
    specialsMenu.addFood(payasam);
    specialsMenu.addDrink(peppermint_mocha_latte);
    specialsMenu.addDrink(halohalo);

    //Variables 
    String Response = "yes";
    String customerName;
    String readyMenu;
    String readyFood;
    String readyDrink; 
    String readyOrder;
    
    //Interactions 
    while(Response.equalsIgnoreCase("yes")){
      System.out.println("Hi customer what is your name?");
      customerName = key.readLine();
      System.out.println("Would you like a menu?");
      Response = key.readLine();
      if(Response.equals ("yes")){
        //Prints out the menu 
        System.out.println(breakfastMenu.getoptionFood());
        System.out.println(breakfastMenu.getoptionDrink());
        System.out.println(lunchMenu.getoptionFood());
        System.out.println(lunchMenu.getoptionDrink());
        System.out.println(dinnerMenu.getoptionFood());
        System.out.println(dinnerMenu.getoptionDrink());
        System.out.println(specialsMenu.getoptionFood());
        System.out.println(specialsMenu.getoptionDrink());

        System.out.println("Have you decided what Menu you want? (breakfast, lunch, dinner, specials)");
        readyMenu = key.readLine();
        if(readyMenu.equalsIgnoreCase("breakfast")){
          //Prints out breakfastMenu options 
          System.out.println(breakfastMenu.getoptionFood());
          System.out.println(breakfastMenu.getoptionDrink());
        }
        else if(readyMenu.equalsIgnoreCase("lunch")){
          //Prints out lunchMenu options
          System.out.println(lunchMenu.getoptionFood());
          System.out.println(lunchMenu.getoptionDrink());
        }
        else if(readyMenu.equalsIgnoreCase("dinner")){
          //Prints out dinnerMenu options 
          System.out.println(dinnerMenu.getoptionFood());
          System.out.println(dinnerMenu.getoptionDrink());
        }
        else if(readyMenu.equalsIgnoreCase("specials")){
          //Prints out specialsMenu options 
          System.out.println(specialsMenu.getoptionFood());
          System.out.println(specialsMenu.getoptionDrink());
        }
        System.out.println("What would you like to eat?");
        readyFood = key.readLine();
        System.out.println("What would you like to drink?");
        readyDrink = key.readLine();
        readyOrder = readyFood + " and " + readyDrink;
        //Creates a new instances for Customer
        Customer customer1 = new Customer(customerName, readyOrder);
        System.out.println(customer1.getName() + " your bill is ready");
        System.out.println("Your order is a " + readyOrder);

        //Gets the subtotal and total and prints it to screen depending on what menu you bought from and what you ordered
        
        if(readyMenu.equalsIgnoreCase("lunch")){
          double priceFood = lunchMenu.getfindFood(readyFood).getPrice();
          double priceDrink = lunchMenu.getfindDrink(readyDrink).getPrice();
          double priceTotal = priceDrink + priceFood;
          Receipt receipt1 = new Receipt(priceTotal);
          System.out.println("Subtotal: $" + receipt1);
          System.out.println("Total: $" + receipt1.gettotal());
        }
        else if(readyMenu.equalsIgnoreCase("breakfast")){
          double priceFood = breakfastMenu.getfindFood(readyFood).getPrice();
          double priceDrink = breakfastMenu.getfindDrink(readyDrink).getPrice();
          double priceTotal = priceDrink + priceFood;
          Receipt receipt1 = new Receipt(priceTotal);
          System.out.println("Subtotal: $" + receipt1);
          System.out.println("Total: $" + receipt1.gettotal());
        }
        else if(readyMenu.equalsIgnoreCase("dinner")){
          double priceFood = dinnerMenu.getfindFood(readyFood).getPrice();
          double priceDrink = dinnerMenu.getfindDrink(readyDrink).getPrice();
          double priceTotal = priceDrink + priceFood;
          Receipt receipt1 = new Receipt(priceTotal);
          System.out.println("Subtotal: $" + receipt1);
          System.out.println("Total: $" + receipt1.gettotal());
        }
        else if(readyMenu.equalsIgnoreCase("specials")){
          double priceFood = specialsMenu.getfindFood(readyFood).getPrice();
          double priceDrink = specialsMenu.getfindDrink(readyDrink).getPrice();
          double priceTotal = priceDrink + priceFood;
          Receipt receipt1 = new Receipt(priceTotal);
          System.out.println("Subtotal: $" + receipt1);
          System.out.println("Total: $" + receipt1.gettotal());
        }

      }else{
        //stops loop
        Response = ("no");
      }
    }
  }
} 


