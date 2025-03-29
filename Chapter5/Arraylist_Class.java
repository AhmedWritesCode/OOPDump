//package Chapter5;

import java.util.ArrayList;

// Unlike arrays, ArrayList can expand/shrink in size (elements can be added and removed after compilation).
// They only store reference data types (can store wrapper).
// Default Capacity is 10, 

public class Arraylist_Class {

  public static void main (String[] args){

  ArrayList townlist = new ArrayList();
  // better do: ArrayList <String> townlist = new ArrayList <>(desired size is optional);

  townlist.add("Johor Bahru");
  townlist.add("Kuala Lumpur");

  townlist.remove(0); // can also remove "Johor Bahru"
  townlist.add("Penang");
  townlist.indexOf("Penang");
  townlist.add(1, "Cyberjaya");
  int size = townlist.size();

  for(int i = 0; i < size; i++){
    System.out.println(townlist.get(i));
  }

  String str = (String) townlist.get(0); // Build Failed if there is no type casting or <String>
  System.out.println(str);

  townlist.set(0, "Selangor");

  System.out.println(townlist);

  townlist.clear();
}

}
