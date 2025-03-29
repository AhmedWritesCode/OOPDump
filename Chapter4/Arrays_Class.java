package Chapter4;

import java.util.*; //has Arrays class

public class Arrays_Class {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int[][] jadual = new int[10][10];

    Arrays_Class obj = new Arrays_Class();
    obj.getData(jadual);
    obj.print(jadual);

    System.out.println();

    Arrays.sort(jadual[0]); // can also state from index to index
    Arrays.sort(jadual[1]); 
    Arrays.sort(jadual[2]);
    Arrays.sort(jadual[3]);
    Arrays.sort(jadual[4]);
    Arrays.sort(jadual[5]);
    Arrays.sort(jadual[6]);
    Arrays.sort(jadual[7]);
    Arrays.sort(jadual[8]);
    Arrays.sort(jadual[9]);

    Arrays.fill(jadual[0], 0); // replace with single element, can choose from index to index before value
  
    obj.print(jadual);

    System.out.println();
    System.out.print("Find: ");
    int x = scanner.nextInt();
    System.out.print("Row: ");
    int row = scanner.nextInt();

    int position = Arrays.binarySearch(jadual[row], x);
    System.out.println("Found at: Column" + position + " Row-" + row);

    if(Arrays.equals(jadual[0], jadual[1]) == true){
      System.out.println("Equal");
    }
    else{
      System.out.println("Not Equal");
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
