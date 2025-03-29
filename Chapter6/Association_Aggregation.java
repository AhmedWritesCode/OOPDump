public class Association_Aggregation {

  // Allows objects to call methods in other objects (arrows comes from the less one)
  //if a->b put a private object of b in a: students -register-> course
  // This can be regarded as an example of Aggregation (White Diamond at the owner's side, Has a).

  public static void main(String[] args){
  
  Student stu1 = new Student("Ahmed", "A22EC4003");
  Student stu2 = new Student("Sohaib", "A21EC4000");

  Course c1 = new Course("WEB", "C0012", 5);
  Course c2 = new Course("OOP", "C0013", 9);
  Course c3 = new Course("DB", "C0014", 4);
  Course c4 = new Course("AI", "C0015", 11);
  Course c5 = new Course("OS", "C0016", 6);

  stu1.registerCourse(c1);
  stu1.registerCourse(c4);
  c2.addStudent(stu1);
  c3.addStudent(stu1);

  stu2.registerCourse(c5);
  c3.addStudent(stu2);
  c1.addStudent(stu2);


  stu1.printAllInfo();
  stu2.printAllInfo();

  }
  
}

class Course{

  private String name;
  private String code;
  private int section;
  private int numOfStudents;
  private Student[] students;

  public Course(String name, String code, int section){
    this.name = name;
    this.code = code;
    this.section = section;
    students = new Student[10];
  }

  public String getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  public int getSection(){
    return section;
  }

  public int getNumberOfStudents(){
    return numOfStudents;
  }

  public void addStudent(Student s){
    students[numOfStudents] = s;
    numOfStudents++;

    s.registerCourse(this);
  }

}

class Student{

  private String name;
  private String matrix;
  private Course[] courses;
  private int numOfCourse;

  public Student(String name, String matrix){
    this.name = name;
    this.matrix = matrix;
    courses = new Course[10];
  }

  public String getName(){
    return name;
  }

  public String getMatrix(){
    return matrix;
  }

  public int getNumberOfCourse(){
    return numOfCourse;
  }

  public void registerCourse(Course c){
    courses[numOfCourse] = c;
    numOfCourse++;
  }

  public void printAllInfo(){
    System.out.println("--------------> Student Information <--------------");
    System.out.println("                  Name: " + name);
    System.out.println("                  Matrix: " + matrix);
    System.out.println("                  Number of Courses: " + numOfCourse);
    System.out.print("                  Courses: ");
    for(int i = 0; i<numOfCourse; i++){
      System.out.print(courses[i].getName() + " ");

      if (i == numOfCourse-1){
        System.out.println();
      }
    } 
    System.out.println("-----------------------------------------------------");
  }


}
