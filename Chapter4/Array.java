package Chapter4;

import java.util.*;

// Array is an object that stores values of the same type.
public class Array {

  static Scanner scanner = new Scanner(System.in);
  static final int SIZE = 5;

  public static void main(String[] args) {

    // Array Elements Deafults are:
    // 1- 0 if numeric 2- '/u0000' (unicode) if char 3- false if boolean 4- null if
    // String

    String[] students = new String[SIZE]; // can also String students[] = {"","",""}; but don't split the assignment
    int score[] = { 99, 35, 78, 14, 33 };

    String[] teachers = new String[SIZE];

    Array obj = new Array();
    obj.insert(students);

    students[SIZE - 1] = "Mr.Robot";

    obj.print(students, score);

    System.out.print("Teachers ");
    System.out.println("Previous Student Papers");

    teachers = obj.reverse(students);

    obj.print(teachers, score);

    System.out.println("Sum of Scores is: " + obj.getSum(score));

    obj.printLargest(score);

    // Anonymous Array
    System.out.println("Anonymous Student Papers");
    obj.print(new String[] {"A1", "A2", "A3", "A4", "A5"}, new int[] {66, 80, 1, 0, 74});

    // Variable-Length Argument (Only one per method, must be last), can pass array or values
    obj.printMsg("Thank ", "You ", "Very ", "Much!" );


    scanner.close();

  }

  public void print(String[] arr, int[] num) {

    int i = 0;

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("                           Students List of Scores");
    System.out.println("---------------------------------------------------------------------------------------");

    for (String e : arr) { // e is a copy not the ref
      System.out.print(e + "  ");
      System.out.println(num[i]);
      i++;
    }
    System.out.println("---------------------------------------------------------------------------------------");

  }

  public void insert(String[] arr) { // array pass is pass by reference

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter Student Name: ");
      arr[i] = scanner.nextLine();
    }
  }

  public String[] reverse(String[] arr) {

    String[] result = new String[arr.length];

    for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
      result[j] = arr[i];
    }
    return result;
  }

  public int getSum(int[] num) {

    int sum = 0;

    for (int i = 0; i < num.length; i++) {

      sum += num[i];
    }

    return sum;

  }

  public void printLargest(int[] num) {

    int largest = num[0];
    int index = 0;

    for (int i = 1; i < num.length; i++) {
      if (num[i] > largest) {
        largest = num[i];
        index = i;
      }
    }
    System.out.println("Largest: " + largest + " With index number " + index);
  }

  public void printMsg(String ... words){
    for(String e : words){
      System.out.print(e);
    }
    System.out.println(" ");
  }

}
