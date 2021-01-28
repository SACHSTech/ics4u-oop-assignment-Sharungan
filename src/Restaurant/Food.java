public class Food{
  private String Name;
  private int Calories;
  private double Price; 

  public Food(String title, int cals, double cost){
    this.Name = title;
    this.Calories = cals;
    this.Price = cost;
  }
  public String getName(){
    return Name;
  }
  public int getCalories(){
    return Calories;
  }
  public int getPrice(){
    return Price;
  }
}