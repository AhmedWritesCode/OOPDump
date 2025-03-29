// import java.util.*; // java.Scanner -> java,util.*

// class Coffee
// {
//   private String coffeeId;
//   private String flavour;
//   private double pricePerUnit;

//   public Coffee(String id, String n, double p)
//   {
//     coffeeId = id;
//     flavour = n;
//     pricePerUnit = p;
//   }

//   public Coffee() {}

//   public String getId()
//   {
//     return coffeeId;
//   }

//   public String getFlavour()
//   {
//       return flavour;
//   }

//   public double getPrice() // String -> double
//   {
//     return pricePerUnit;
//   }

//   public void display()
//   {
//        System.out.printf("%-15s%-15s%-10.2f\n",coffeeId,flavour,pricePerUnit);
//   }
// }


// class DiscountedItem extends Coffee
// {
//   private double discRate;

//   public DiscountedItem(double r) // class -> public
//   {
//     super(); //created Coffee()
//       discRate = r;
//   }

//   public double getPrice()
//   {
//     return (getPrice()-(getPrice()*discRate));
//   }
// }


// class Customer
// {
//   private String customerName;

//   public Customer(String n)
//   {
//       customerName = n;
//   }

//   public String getName()
//   {
//       return customerName;
//   }
// }


// class CoffeeOrder
// {
//   private int orderId, unit;
//   private Customer customer;
//   private Coffee item;

//   public CoffeeOrder(int id, Customer c, Coffee i,int u) // String c-> Customer, String i-> Coffee
//   {
//     customer = c;
//     orderId = id;
//     item = i;
//     unit = u;
//   }

//   public double calcTotalPrice(Coffee item)
//   {
//       return item.getPrice()*unit; // getPrice -> item.getPrice
//     }

//   public String toString()
//   {
//     return ("\nOrder ID: " +orderId+"\nCustomer Name: "+customer.getName()+"\nFlavour: " +item.getFlavour()+ "\nQuantity: " +unit+"\nPrice per Unit: "+item.getPrice()+"\nTotal Price: " +calcTotalPrice(item));
//   }
// }


// public class TestOrder
// {
//    public static void main(String[] args)
//    {

//      Coffee myCoffee = new Coffee("CC001", "Caramel", 10.00);
//      Coffee yourCoffee = new Coffee("CC008", "Latte ", 8.00); //DI->Coffee, removed 0.10
//      Coffee hisCoffee= new Coffee("CC009", "Mocha", 9.00);

//      System.out.println("\n ITEM DESCRIPTION");
//      System.out.println("********************");
//      System.out.printf("%-15s%-15s%-25s\n", "Coffee ID", "Flavour", "Price");
//      System.out.printf("%-15s%-15s%-25s\n", "*********", "********", "******");

//      Vector<Coffee> menu = new Vector<Coffee>();
//      menu.add(myCoffee);
//      menu.add(yourCoffee);
//      menu.add(hisCoffee);

//      for (int i = 0; i < menu.size(); i++) // Coffee.size -> menu.size
//      {
//       menu.elementAt(i); // display -> elementAt
//      }

//      System.out.println("************************************");

//          Customer [] c= new Customer[3];
//          c[0] = new Customer("Arif");
//          c[1] = new Customer("Hakim");
//          c[2] = new Customer("Nuha"); // 3->2

//         ArrayList<CoffeeOrder> order = new ArrayList<CoffeeOrder>(); // Object -> CoffeeOrder, added new and ()

//     order.add(new CoffeeOrder(1, c[0],myCoffee,2)); // addElement -> add
//     order.add(new CoffeeOrder(2, c[1],yourCoffee,3));
//     order.add(new CoffeeOrder(3, c[2],hisCoffee,1));

//     System.out.println("List of orders :\n");

//     for (int i = 0; i < order.size(); i++) //length -> size
//     {
//       System.out.println((order.get(i)).toString()); // removed(ArrayList), added get()
//     }
//   }
// }
