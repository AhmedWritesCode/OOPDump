import java.util.*;
import java.io.*;

public class StudentResults {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter student's matrics number: ");
      String matricsNumber = scanner.nextLine();

      try {
          BufferedReader reader = new BufferedReader(new FileReader(matricsNumber + ".txt"));
          String name = reader.readLine();
          Student student = new Student();
          student.setName(name);
          student.setMatric(matricsNumber);

          double totalGradePoints = 0.0;
          int totalCredits = 0;

          String line;
          while ((line = reader.readLine()) != null) {
              String[] parts = line.split(" ");
              String grade = parts[0];
              Course courseCode = Course.valueOf(parts[1]);

              Course course = Course.valueOf(parts[2]);
              totalCredits += course.getCredit();
              totalGradePoints += course.getCredit() * course.getGradeValue();

              student.addCredit(course.getCredit());
          }
          reader.close();

          student.setGPA(totalGradePoints / totalCredits);

          BufferedWriter writer = new BufferedWriter(new FileWriter("Slip" + matricsNumber + ".txt"));
          writer.write("EXAMINATION RESULTS FOR SEM 2, 2018/2019\n");
          writer.write("NAME : " + student.getName() + "\n");
          writer.write("MATRICS NO : " + student.getMatric() + "\n");
          writer.write("CODE COURSE CREDIT GRADE\n");
          writer.write("==============================================================\n");

          reader = new BufferedReader(new FileReader(matricsNumber + ".txt"));
          reader.readLine(); // Skip the name line
          while ((line = reader.readLine()) != null) {
              String[] parts = line.split(" ");
              String grade = parts[0];
              Course courseCode = Course.valueOf(parts[1]);

              Course course = Course.valueOf(parts[2]);
              writer.write(courseCode.name() + " " + course.getDesc() + " " + course.getCredit() + " " + grade + "\n");
          }
          reader.close();

          writer.write("==============================================================\n");
          writer.write("CREDIT EARNED : " + Student.getTotalCredit() + "\n");
          writer.write("GPA : " + String.format("%.2f", student.getGPA()) + "\n");
          writer.close();

          System.out.println("Examination Slip is generated...");
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}

class Student{
  private String name;
  private String matric;
  private double gpa;

  public static double totalCredit;

  public Student(String name, String matric, double gpa){
    this.name = name;
    this.matric = matric;
    this.gpa = gpa;
    totalCredit = 0;
  }

  public Student(){}

  public String getName(){
    return name;
  }

  public String getMatric(){
    return matric;
  }

  public double getGPA(){
    return gpa;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setMatric(String matric){
    this.matric = matric;
  }

  public void setGPA(double gpa){
    this.gpa = gpa;
  }

  public void addCredit(int credit){
    totalCredit += credit;
  }

  public static double getTotalCredit(){
    return totalCredit;
  }

}


  enum Course {
    SCSJ2154("Object Oriented Programming", 4), SCSD2623("Database Programming", 3), SCSV1223("Web Programming", 3),
     SCSJ2203("Software Engineering", 3), SCSR2043("Operating Systems", 3), ULAB2122("Advanced Academic English Skills", 2),
      UCSD2762("Fundamentals of Technopreneurship", 2), SCSD3761("Technopreneurship Seminar", 1);

      private String desc;
      private int credit;
      private char grade;

      Course(String desc, int credit){
        this.desc = desc;
        this.credit = credit;
      }

      Course(){}

      public String getDesc(){
        return desc;
      }

      public int getCredit(){
        return credit;
      }

      public void setDesc(String desc){
        this.desc = desc;
      }

      public void setCredit(int credit){
        this.credit = credit;
      }

      public double getGradeValue(){
        switch(grade){
          case 'A':
            return 4.0;

          case 'B':
            return 3.0;

          case 'C':
            return 2.0;

          case 'D':
            return 1.0;

          case 'E':
            return 0.0;

          default:
            return 0.0;
        }
      }
  }