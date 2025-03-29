package Chapter3; //Using Run Java

public class Enum_Class {

enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;} //; each of them is an obj of day
static Day WORKDAY = Day.MONDAY; //Don't Forget to static the static attribtutes!
//enums are finals (constants) & implictly Static, don't use new operator.
public static void main(String[] args){

  Day Holiday = Day.FRIDAY;
  System.out.println("________________________________________________________________________");
  System.out.println(Holiday + " is the week holiday all year.");
  System.out.println("However, people tend to like " + Day.THURSDAY + " more.");
  System.out.println("But of course, we can't forget " + Day.SUNDAY + ", The " + Day.SUNDAY.ordinal() + "st day od the week!" );
  System.out.println("The difference between THURSDAY and the latter is " + Day.SUNDAY.compareTo(Day.THURSDAY));
  System.out.println("*********************************************************************");

  if(Day.MONDAY.equals(WORKDAY)){
    System.out.println("After a certain use, when an object has \n" +
            "no references pointing to it, then the \n" +
            "system will erase the object and make \n" +
            "the memory space available for other \n" +
            "uses. Dellocation is Erasing an Object\n" +
             "This is called Garbage collection.");
    System.out.println("________________________________________________________________________");

  }


}
  
}

