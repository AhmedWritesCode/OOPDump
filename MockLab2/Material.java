public class Material extends Item {
	// Define Material instance variables [2 Marks]
	// ???
    String spec;
    int qty;

    Material(String name, double price, String spec, int qty) {
        // Complete Material constructor implementation [2 Marks]
        // ???
            super(name, price);
            this.spec = spec;
            this.qty = qty;
        }
    


    // Implement getTotalPrice method [3 Marks]
    // ???
    public double getTotalPrice(){
        return price * qty;
    }


    // Implement printInfo method [7 Marks]
    // ??
    public void printInfo(){

        super.printInfo();
        System.out.println("    Spec: " + spec);
        System.out.println("    Qty: " + qty);
        System.out.println("  Total Price: " + getTotalPrice());
    }
}