// Enclosing class
class BigOuter {

  //Universal variables like PI, System.out, Color.BLUE, and BorderLayout.NORTH are all static!
  // static final: a contstant shared by all objects of a class

  // Static nested class
  static class Nested {
      void printMessage() {
          System.out.println("This is a message from the static nested class.");
      }
  }
  
  // Static method to access the nested class
  static void accessNested() {
      // Accessing the nested class without creating an instance of the outer class
      Nested nestedObject = new Nested();
      nestedObject.printMessage();
  }
  
// static methods only access and change static elements
//   public void methoTry(){
//     System.out.println("This is a Trial");
//   }

//   public static void methoTryS(){
//     methoTry();
//   }
  
  // Static variable
  public static int ctr = 0;

  // Method to increment staticVar
  public static void incrementCtr() {
      ctr++;
  }

}

public class StaticNested {
  public static void main(String[] args) {
      // Call the static method through the class (No Object)
      BigOuter.accessNested();
      
      // Create an instance of the static nested class using "dot notation"
      BigOuter.Nested nest = new BigOuter.Nested();
      nest.printMessage();
      
      // Increment staticVar using one object
      BigOuter.incrementCtr();

      BigOuter objOne = new BigOuter();
      BigOuter objTwo = new BigOuter();

      System.out.println("Value of ctr after incrementing: " + BigOuter.ctr);
      
      objOne.incrementCtr();
      System.out.println("Value of ctr after incrementing: " + BigOuter.ctr);
      
      System.out.println("ObjTwo Ctr: " + objTwo.ctr);

      objTwo.ctr++;
      System.out.println("Outer Ctr: " + BigOuter.ctr);

  }
}
