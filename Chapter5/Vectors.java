import java.util.Vector;

public class Vectors {

//   Vector is a resizable array in Java,
//  like ArrayList, but thread-safe (More Synchronized). Objects only (can use wrapper), if it works it's because they are auto
//helping you. (converting to wrapper).
// May want to use instanceof.
  
  public static void main(String[] args) {

    Vector faculty = new Vector(); // size is optional
    faculty.addElement("Computing");
    faculty.insertElementAt("Engineering", 0);
    faculty.addElement("Bio-Chemical");
    faculty.addElement("Art");
    faculty.addElement("Electrical");
    faculty.addElement("Mechanical");
    faculty.addElement("Medical");
    
    faculty.removeElement("Medical");
    faculty.removeElementAt(2);
    faculty.setElementAt("Science", 2);

    Integer testr = new Integer(31); // This is to show that vectors can store different ref types together.
    faculty.addElement(testr);

    System.out.println(faculty + " " + faculty.size() + " Faculties");
    System.out.println("Faculty of " + faculty.elementAt(1) + ", is The Best Faculty!");
  }
}
