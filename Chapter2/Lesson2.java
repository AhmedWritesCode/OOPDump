import javax.swing.JOptionPane;

public class Lesson2 {

  public static void main(String[] args) {

        //JOptionPane
        String name = JOptionPane.showInputDialog("Your Name: "); //return a string
        JOptionPane.showMessageDialog(null, "Hello, " +  name); 

        int age = Integer.parseInt(JOptionPane.showInputDialog("Your Age: "));
        JOptionPane.showMessageDialog(null, "You are " +  age);


        String uppername = name.toUpperCase();
        String lowername = name.toLowerCase();
        char sec = name.charAt(1);
        int namelength = name.length();
        JOptionPane.showMessageDialog(null, uppername + " " + lowername + " " + sec + " " + namelength);

        System.exit(0);

  }
  
}
