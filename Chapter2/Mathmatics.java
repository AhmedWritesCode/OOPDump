import java.util.Scanner;
import java.util.Random;

public class Mathmatics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Pi");
            System.out.println("2. Calculate Euler's number (e)");
            System.out.println("3. Calculate Square root");
            System.out.println("4. Calculate Power");
            System.out.println("5. Calculate Natural Logarithm");
            System.out.println("6. Calculate Base-10 Logarithm");
            System.out.println("7. Calculate Ceiling");
            System.out.println("8. Calculate Floor");
            System.out.println("9. Calculate Rounded Value");
            System.out.println("10. Calculate Maximum");
            System.out.println("11. Calculate Minimum");
            System.out.println("12. Generate Random Double Value");
            System.out.println("13. Generate Random Double Value between 0 and 100");
            System.out.println("14. Generate Random Integer Value between 1 and 100");
            System.out.println("15. Pythagorean Theorem Problem Solver");
            System.out.println("16. Calculate Area of a Circle");
            System.out.println("17. Generate Random value (via class)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Pi: " + Math.PI);
                    break;
                case 2:
                    System.out.println("Euler's number (e): " + Math.E);
                    break;
                case 3:
                    System.out.println("Square root of 25: " + Math.sqrt(25));
                    break;
                case 4:
                    System.out.println("2 raised to the power of 3: " + Math.pow(2, 3));
                    break;
                case 5:
                    System.out.println("Natural logarithm of 10: " + Math.log(10));
                    break;
                case 6:
                    System.out.println("Base-10 logarithm of 10: " + Math.log10(10));
                    break;
                case 7:
                    System.out.println("Ceiling of 10.7: " + Math.ceil(10.7));
                    break;
                case 8:
                    System.out.println("Floor of 10.7: " + Math.floor(10.7));
                    break;
                case 9:
                    System.out.println("Rounded value of 10.7: " + Math.round(10.7));
                    break;
                case 10:
                    System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
                    break;
                case 11:
                    System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));
                    break;
                case 12:
                    System.out.println("Random value between 0.0 and 1.0: " + Math.random());
                    break;
                case 13:
                    System.out.println("Random value between 0.0 and 100.0: " + Math.random() * 100);
                    break;
                case 14:
                    System.out.println("Random value between 1 and 100: " + (int) (Math.random() * 100) + 1);
                    break;
                case 15:
                    double x, y, z;
                    System.out.print("Enter the length of side x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter the length of side y: ");
                    y = scanner.nextDouble();
                    z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                    System.out.println("The length of the hypotenuse is: " + z);
                    break;
                case 16:
                    Circle c1 = new Circle(5);
                    System.out.println("Area of the circle: " + c1.getArea());
                    break;
                case 17:
                    System.out.println("Random value (via class): " + (random.nextInt(9) + 1));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}

class Circle {

    private double raidus, area;
    final double PI = 3.14159;

    Circle(double r) {
        raidus = r;
    }

    public double getArea() {
        area = PI * raidus * raidus;
        return area;
    }
}

