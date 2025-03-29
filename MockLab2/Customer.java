import java.util.Vector;

public class Customer extends Person {
    // Define Customer instance variables [4 Marks]
    // ???
    private String address;
    private String phone;
    private Vector<Item> items;

    Customer(String name, String ic_no, String address, String phone) {
        super(name, ic_no);

        // Complete Customer constructor implementation [4 Marks]
        // ???
        this.address = address;
        this.phone = phone;
        items = new Vector<>(); //the wrong thing was the identifier (look at the method implementation paramerts)
    }

    public void addItem(Item item) {
        // Implement add item method [2 Marks]
        // ???
        items.add(item);
    }

    // Add method to print Customer info and items ordered [20 Marks]
    // ???
    public void printInfo(){
        double grandTotal = 0;
        super.printInfo();
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);

        System.out.println("\n Ordered items: \n");
        System.out.println("......................");

        for(int i = 0; i <items.size(); i++){
            items.get(i).printInfo();
            grandTotal += items.get(i).getTotalPrice();
        }

        System.out.println("\nGrand Total Price: " + grandTotal);

    }
}