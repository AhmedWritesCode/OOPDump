import java.util.Scanner;

public class Overloading_Methods{
  
  int age;
  String name;
  static Scanner scanner = new Scanner(System.in); // static to close scanner

public static void main(String[] args) {

  Overloading_Methods obj1 = new Overloading_Methods();
  Overloading_Methods obj2= new Overloading_Methods();
  Overloading_Methods obj3 = new Overloading_Methods();


  obj1.getData();

  obj2.getData(20);

  obj3.accessPrivateGetData("Ahmed");

  System.out.println("*************************************************************************");


  System.out.println(obj1.name);
  System.out.println(obj1.age);

  System.out.println(obj2.name);
  System.out.println(obj2.age);

  System.out.println(obj3.name);
  System.out.println(obj3.age);

  System.out.println("*************************************************************************");


  scanner.close();
}

public void getData(){
  System.out.println("Enter your name: ");
  name = scanner.nextLine();
  System.out.println("Enter your age: ");
  age = scanner.nextInt();
  scanner.nextLine();
}

public int getData(int years){
  age = years;
  System.out.println("Enter you name: ");
  name = scanner.nextLine();
  return 5;
}

private void getData(String aname){
  name = aname;
  System.out.println("Enter your age: ");
  age = scanner.nextInt();
}

public void accessPrivateGetData(String years) {
  getData(years);
}
}