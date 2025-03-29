package Chapter4;

public class Array_of_Objects {

  public static void main(String[] args){

  Food f1 = new Food("Apple", 20);
  Food f2 = new Food("Beef", 23);
  Food f3 = new Food("Beans", 77);

  Food[] fridge = {f1, f2, f3};

  //Alternative way of creating array of objects, can also initilaze then assign them each by st
  Food[] trash = {new Food("Expired", 18), new Food("Damaged", 55)};

  System.out.println("Food 1: " + fridge[0].name + " " + fridge[0].stock);
  System.out.println("Food 2: " + fridge[1].name + " " + fridge[1].stock);
  System.out.println("Food 3: " + fridge[2].name + " " + fridge[2].stock);
  System.out.println("Food 4: " + trash[0].name + " " + trash[0].stock);
  System.out.println("Food 5: " + trash[1].name + " " + trash[1].stock);

  }

  
}

class Food {

  public String name;
  public int stock;

  public Food(String name, int stock){
    this.name = name;
    this.stock = stock;
  }
}