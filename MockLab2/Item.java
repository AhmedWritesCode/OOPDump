public class Item {
    protected String name;
    protected double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getTotalPrice() {
        return 0;
    }

    public void printInfo() {
        System.out.println("Item Name: " + name);
        System.out.println("    Price: " + price);
    }
}