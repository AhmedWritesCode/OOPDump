import java.util.Vector;

public class PatientSystem {
    public static void main(String[] args) {

        /*
            Define a Vector to dynamically store objects of Patient
        */
        Vector<Patient> patients = new Vector<Patient>();



        /*
            Initialize the Patient and Address objects based on the information given in the Table
            Then, add the Patient objects into the Vector.
        */
        Address a1 = new Address("Jalan Pahlawan", "Skudai", 81300, "Johor");
        Patient p1 = new Patient("P0001", "Akmal ", "Adnan", "Male", a1, 180, 82);

        Address a2 = new Address("Jalan Flora", "Skudai", 81300, "Johor");
        Patient p2 = new Patient("P0002", "Syafiq ", "Yusof", "Male", a2, 186, 80);

        Address a3 = new Address("Jalan Bakti", "Skudai", 81300, "Johor");
        Patient p3 = new Patient("P0003", "Mei Ling ", "Koh", "Female", a3, 168, 45);

        patients.addElement(p1);
        patients.addElement(p2);
        patients.addElement(p3);


 		/*
            Invoke the displayRecord function to display the list of patients
        */

        displayRecord(patients);

        





        /*
            Remove the 2nd patient in the list
        */

        patients.removeElementAt(1);



 		/*
            Invoke the displayRecord function again to display the list of patients
        */

        displayRecord(patients);


    }



    /*
        This function display the record of the patient. This function is INCOMPLETE.
        Please complete the function to display the output as shown in Figure 2.
    */
    public static void displayRecord(Vector<Patient> pL) {

        System.out.println("\nPatient Record Management System");
        System.out.println("================================");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-10s\n", "No", "PatientID", "Name", "Gender", "Address", "Height", "Weight", "BMI");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-10s\n", "--", "---------", "----", "------", "-------", "------", "------", "---");


		//To display the list of patients based on output given in Figure 2
        for(int i = 0; i < pL.size(); i++) {
            System.out.printf("%-5d%-10s%-25s%-10s%-50s%-10d%-10d%-10.2f\n", (i+1), pL.get(i).getPatientID(),
                              pL.get(i).getFullName(), pL.get(i).getGender(), pL.get(i).getAddress().getAddress(), 
                              pL.get(i).getHeight(), pL.get(i).getWeight(), pL.get(i).getBMI()
                              );
        }

        System.out.println("\n-------------------");
        System.out.println("Total Patients: "+ pL.size());
    }
}