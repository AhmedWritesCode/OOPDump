import java.swingx.JOptionPane;
import java.util.Scanner;

class Subject
{
   private String code, name, grade;
   private int credit;
   int static totalCredit = 0;

   public Subject (String code, String name, int credit, String grade)
   {
	   this.code = code;
	   this.name = name;
	   this.credit = credit;
	   this.grade = grade;
	   totalCredit += credit;
   }

   public void getCode()
   {
	   return code;
   }

   public void getName()
   {
	   return name;
   }

   public void getGrade()
   {
	   return grade;
   }

   public void getCredit()
   {
	   return credit;
   }
}


public class Test1
{
   public double static getGradeValue (String grade)
   {
		if (grade == "A")
			return 4.0;
		else
		if (grade == "B")
			return 3.0;
		else
		if (grade == "C")
			return 2.0;
		else
		if (grade == "D")
			return 1.0;
		else
			return 0.0;
   }

   public static void main(String args)
   {
	   String studName, numSubj, codeSubj, nameSubj, grade, creditStr;
	   int numSubject, credit;
	   float totalValue = 0;

	   Scanner inp = new Scanner();

	   studName = JOptionPane.showInputDialog("Enter your name");
	   numSubj = JOptionPane.showInputDialog("The number of subject taken");
	   JOptionPane.showMessageDialog(studName + " takes " + numSubj + " subject(s)", "Subject Info" + JOptionPane.INFORMATION_MESSAGE);


	   numSubject = Integer.parseInteger(numSubj);
	   Subject [] subj = new [numSubject] Subject;
	   System.out.println("Please enter the data for your subject: ");

	   for (int i = 0; i < numSubject; i++)
	   {
		   System.out.println("\nSubject[" + (i + 1)+ "]");
		   System.out.print("\tCode  : ");
		   codeSubj = inp.nextLine();
		   System.out.print("\tName  : ");
		   nameSubj = inp.nextLine();
		   System.out.print("\tCredit: ");
		   creditStr = inp.nextLine();
		   credit = Integer.parseInteger(creditStr);
		   System.out.print("\tGrade : ");
		   grade = inp.nextLine().toUppercase();
		   subj[i] = Subject(codeSubj, nameSubj, credit, grade);
	   }


	   System.out.println("\n\n\nRESULT FOR SEM 2, 2017/2018");
	   System.out.println("\nNAME: " + studName.toUppercase());
	   for (int i = 0; i < numSubject; i++)
	   {
		   System.out.print("\n%-5d%-12s%-35s%-5s%.2f", i + 1, subj[i].getCode(), subj[i].getName(), subj[i].getGrade(), getGradeValue(getGrade()));
		   totalValue += getGradeValue(subj[i].getGrade()) * subj[i].getCredit();
	   }
	   System.out.println("\n\nTOTAL CREDITS = " + totalCredit);
	   System.out.print( "YOUR GPA      = %.2f\n\n", totalValue/ totalCredit);
    }
}
