import java.util.Scanner;

public class TryHere{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Rectangle x = new Rectangle(2, 4);
    Rectangle y = new Rectangle(4, 2);
    Rectangle z = new Rectangle(9, 5);

    Rectangle a = new Rectangle().inputRectangle();
    Rectangle copyOfA = new Rectangle(a);

    System.out.println("xy: " + (x.requals(y)));
    System.out.println("xz: " + (x.requals(z)));
    System.out.println("zy: " + (y.requals(z)));
    System.out.println("xa: " + (x.requals(a)));
    System.out.println("acopy: " + (copyOfA.requals(a)));


    //All object have these methods
    System.out.println(x.toString()); // return class anme and hash of address
    System.out.println(y.equals(a)); // compare objects by their content rather than memory address
    



    scanner.close();


}
}

class Rectangle{

  public double l, w;

  public Rectangle(){};

  public Rectangle(double x, double y){
    l = x;
    w = y;
  }

  // the correct way to copy an object, Deep copy (Not assignment Operator) thorugh Copy Constructor
  public Rectangle(Rectangle copy){
    l = copy.l;
    w = copy.w;
  }


  public double calcArea(){
    return l * w;
  }

  public boolean requals (Rectangle r){
  return this.calcArea() == r.calcArea();
  }

  public Rectangle inputRectangle() {
    Scanner scanner = new Scanner(System.in);
    double width, length;
    System.out.print("Enter width: ");
    width = scanner.nextDouble();
    System.out.print("Enter length: ");
    length = scanner.nextDouble();
    scanner.close();
    return new Rectangle(length, width);
}

}