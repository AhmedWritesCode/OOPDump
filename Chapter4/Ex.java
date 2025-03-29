package Chapter4;

import java.util.*;

public class Ex {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    int[][] jadual = new int[4][5];

    Ex e = new Ex();
    e.fillJadual(jadual);
    e.printJadual(jadual);

    scanner.close();
  }

  public void fillJadual(int[][] num){

    for(int i = 0; i < num.length; i++){
      for(int j = 0; j < num[i].length; j++){
        System.out.print("Fill " + "Row " + i + " Column " + j + ": ");
        num[i][j] = scanner.nextInt();
      }
    }
  }

  public void printJadual(int[][] num){
    for(int i = 0; i < num.length; i++){
      for(int j = 0; j < num[i].length; j++){
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
