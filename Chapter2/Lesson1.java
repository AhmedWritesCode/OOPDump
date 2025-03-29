// Compiling Code is transforming Source (.java = high lvl) Code into Object (low lvl = Machine) Code.
// Java transform Source Code to (via compiler) Byte (.class) Code to (via JVM) Object Code; to run at different machines.

// package pkg1; //put related classes in same pkg to interact

import java.util.Scanner;

public class Lesson1 {
	
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Name? "); // escape sequences: \t - \n - \" \" - \\
    String name = scanner.nextLine(); // ref variable, instance = inside class/ local = inside method (must be initialized, final mod only)
    // final primitive can't change value, final ref can't change reference but can change value
    // variable scope (life span): static=class > instance=instance > local=method > block=block
    //error: acs inst from stat(psvm method), acs loc from nested method, using blk var after blk ended
    System.out.print("Age? ");
    int age = scanner.nextInt(); //nextInt doesn't read \n, primitive variable (8 types)
    //can't store double in an int, opposite can
    scanner.nextLine(); //to read the \n in the scanner / avoid error

    System.out.println( "I am "  + name +   " I am "  + age);
    
    //Implicit type casting (Automatic) also can use to know result type: byte > short > int > long > float > double
    //                                                                                 char^
    //Exception: byte/short are promoted to int
    int aimpex1 = 100;
    long bimpex2 = aimpex1;

    byte abyteexper1 = 10;
    byte bbyteexper2 = 20;
    int resultofexperimentbyteplusbyte = abyteexper1 + bbyteexper2; //error: the result isn't byte but int
    //Explicit type casting (Instrcted by Programmer)
    double dexpex3 = 4.5;
    int iexpex4;
    iexpex4 = (int) dexpex3;

    //Modules %: 10 % 3 = 1 because 10/3 doesn't divide evenly otherwise it becomes 0.Shorthand Arthmetic through or *%/+-=
    //Precedence Rule: Method call > - (unary) > new, type cast > *,/,% > +,- (binary) > =. (note:left to right priority if same)
    //Exception: right to left priority for equal assignment.
    //Increment Operator:
    int var = 5;

    int postIncrementResultex1 = var++; // postIncrementResult will be 5
    // var is now 6

    int preIncrementResultex2 = ++var; // preIncrementResult will be 7
    // var is now 7


  }
}
