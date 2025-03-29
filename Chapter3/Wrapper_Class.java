package Chapter3;
// Wrappers: wraps primitive values in a Classes that offer static final methods to manipulate the values
public class Wrapper_Class {

  public static void main(String[] args) {

    // Autoboxing, we didn't use the constructors
    Boolean b;
    Character c = '@';
    Integer i = 123;
    Double d = i.doubleValue(); // xxxValue method, convert primitive type to another (unwrap)

    i++; // unwrap, increment, rewrap.
    d = new Double(i); //rewrap it

    // Using Constructors (Don't use "" for Character)
    Integer a1 = new Integer(1);
    Integer a2 =  Integer.valueOf("5"); // returns an Integer
    Integer a3 = Integer.parseInt("10"); // returns an int
    Character c1 = new Character('c');

    // parseDouble ... all wrap except parseInt
    //toString returns a string wiht the value of the primitve

    System.out.println("Integer: " + (d));


    
  }
  
}
