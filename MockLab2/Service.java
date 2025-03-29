public class Service extends Item {
    // Define Service instance variables [1 Marks]
    // ???

    private double man_hours;

    Service(String name, double man_hours) {
        super(name, 15);

        // Complete Service constructor implementation [2 Marks]
        // ???
        this.man_hours = man_hours;
    }


    // Implement getTotalPrice method [7 Marks]
    // ???
    public double getTotalPrice(){

        if(man_hours <= 0.5){
            return 15.0;
        }
        else{
            return 15 + 15 * (man_hours - 0.5);
        }
    }


    // Implement printInfo method [6 Marks]
    // ???
    public void printInfo(){
        super.printInfo();
        System.out.println("    Man Hours: " + man_hours);
        System.out.println("    Total Price: " + getTotalPrice());
    }
}