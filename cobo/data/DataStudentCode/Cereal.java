//Team Mamba :: Nafiz Labib, Prattay Dey, Kartik Vanjani
//APCS
//Lab 08 - America's Next Top Data Scientist
//2022-04-05
//time spent: 3.0 hr

public class Cereal
{
  private String _name;
  private String _type;
  private double _calories;
  private double _protein;
  private double _fat;
  private double _sodium;
  private double _fiber;
  private double _carbs;
  private double _sugar;
  private double _potassium;
  private double _vitamins;
  private double _shelf;
  private double _weight;
  private double _cups;
  private double _rating;

  public Cereal(String name, String type, double calories, double protein, double fat, double sodium, double fiber, double carbs, double sugar, double potassium, double vitamins, double shelf, double weight, double cups, double rating)
  {
    _name = name;
    _type = type;
    _calories = calories;
    _protein = protein;
    _fat = fat;
    _sodium = sodium;
    _fiber = fiber;
    _carbs = carbs;
    _sugar = sugar;
    _potassium = potassium;
    _vitamins = vitamins;
    _shelf = shelf;
    _weight = weight;
    _cups = cups;
    _rating = rating;
  }

  public String getName(){ return _name; }
  public String getType(){ return _type; }
  public double getCalories(){ return _calories;}
  public double getProtein(){ return _protein; }
  public double getFat(){ return _fat; }
  public double getSodium(){ return _sodium; }
  public double getFiber(){ return _fiber; }
  public double getCarbs(){ return _carbs; }
  public double getSugar(){ return _sugar; }
  public double getPotassium(){ return _potassium; }
  public double getVitamins(){ return _vitamins;}
  public double getShelf(){ return _shelf; }
  public double getWeight(){ return _weight; }
  public double getCups() { return _cups; }
  public double getRatings() { return _rating; }

  public static void main(String[] args){
    Cereal appleJacks = new Cereal("Apple Jacks", "C", 110.0, 2.0, 0.0, 125.0, 1.0, 11.0, 14.0, 30.0, 25.0, 2.0, 1.0, 1.0, 33.174094);

    System.out.println(appleJacks.getName());
    System.out.println(appleJacks.getCalories());
    System.out.println(appleJacks.getProtein());
    System.out.println(appleJacks.getFat());
    System.out.println(appleJacks.getSodium());
    System.out.println(appleJacks.getFiber());
    System.out.println(appleJacks.getCarbs());
    System.out.println(appleJacks.getSugar());
    System.out.println(appleJacks.getPotassium());
    System.out.println(appleJacks.getVitamins());
    System.out.println(appleJacks.getShelf());
    System.out.println(appleJacks.getWeight());
    System.out.println(appleJacks.getCups());
    System.out.println(appleJacks.getRatings());
  }

}
