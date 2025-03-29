package Chapter4;

//Multi-Dimensional Array: an array of arrays

public class Two_Dimensional_Array {

  public static void main(String[] args){

  // Each inside bracket is a row which is the first []: row-column
  //Array Length: row, Array[] Length: column
  //An Array that have different row lengths is Ragged
  String[][] students = {{"Ahmed", "Ali", "Mohammed"},{"Abdullah", "Abdulrahman", "Sulaiman"},{"Musa", "Isa", "Sultan"}};

  /*
  Can also:
  String students[] = new String[3];
  students[0] = new String[4];
  students[1] = new String[6];
  students[2] = new String[2];
  */

  int[][] jadual = new int[10][10];
  

  students[2][2] = "Mr.Robert";

  Two_Dimensional_Array obj = new Two_Dimensional_Array();
  obj.print(students);

  obj.getData(jadual);
  obj.print(jadual);

  }

  public void print(String[][] stu){

    for(int i=0; i<stu.length; i++){

      System.out.println();

      for(int j = 0; j < stu[i].length; j++){
        System.out.print(stu[i][j] + " ");
      }
    }
  }

  public void getData(int[][] num){
    for(int i = 0; i < num.length; i++){

      for(int j = 0; j < num[i].length; j++){
        num[i][j] = (int)(Math.random() * 100);
      }
    }
  }

  public void print(int[][] num){
    for(int i = 0; i < num.length; i++){
      System.out.println();
      for(int j = 0; j < num[i].length; j++){
        System.out.print(num[i][j] + " ");
      }

    }

  }

}
