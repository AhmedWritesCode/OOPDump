

public class Lesson3 {

  //  static: field is shared among all objects of the class, final: constant, must be initialized.
  //  Both of these may be presented in instance fields.
  private static final int justAnExampleInteger1 = 99;
  public int length;
  public String name;

  //No Argument Constructor
  public Lesson3() {
    System.out.println("Start Lesson 3");
  }

  //Copy Constructor
  public Lesson3(Lesson3 copy){
    length = copy.length;
    name = copy.name;
  }

  public Lesson3(int n, int n1){
    System.out.println("Cancel Lesson 3");
  }

  //Constructor Calling Constructor
  public Lesson3(int n) {
    this(n, 0);

  }

  public static void main(String[] args){

    Lesson3 englishlesson = new Lesson3(5);
    Lesson3 frenchlesson = new Lesson3(englishlesson);
    Lesson3 mathlesson = new Lesson3();
  }
}
