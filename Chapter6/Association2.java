public class Association2 {

  //if this file doesn't work, try commenting the other file. Apparently, them having same class names result
  //unprecedent problems.

  public static void main(String[] args){

    Student stu1 = new Student("Ahmed", "A22EC4003");
    Student stu2 = new Student("Sohaib", "A21EC4000");

    Registration r1 = new Registration(stu1);
    Registration r2 = new Registration(stu2);
  
    Course c1 = new Course("WEB");
    Course c2 = new Course("OOP");
    Course c3 = new Course("DB");
    Course c4 = new Course("AI");
    Course c5 = new Course("OS");

    r1.registerCourse(c1);
    r1.registerCourse(c4);
    r1.registerCourse(c2);
    r1.registerCourse(c3);
  
    r2.registerCourse(c5);
    r2.registerCourse(c3);
    r2.registerCourse(c1);
  
    r1.printAllInfo();
    r2.printAllInfo();
  
    }
}

class Registration {
 //here we used an associative class

 private Student student;
 private Course[] courses;
 private int numOfCourse;

 public Registration(Student student){
  courses = new Course[10];
  this.student = student;
  numOfCourse = 0; // for some reason, this isn't necessary
 }

 public void registerCourse(Course c){
  courses[numOfCourse] = c;
  numOfCourse++;
}

public void printAllInfo(){
  System.out.println("--------------> Student Information <--------------");
  System.out.println("                  Name: " + student.getName());
  System.out.println("                  Matrix: " + student.getMatrix());
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

class Course{

  private String name;


  public Course(String name){
    this.name = name;

  }

  public String getName(){
    return name;
  }

}

class Student{

  private String name;
  private String matrix;

  public Student(String name, String matrix){
    this.name = name;
    this.matrix = matrix;
  }

  public String getName(){
    return name;
  }

  public String getMatrix(){
    return matrix;
  }

}
