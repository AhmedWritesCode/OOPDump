public class Patient extends Person{

  //Inherits from Person class

private String patientID;
private HealthInfo pHealth;

public Patient(String patientID, String firstName, String lastName, String gender, Address address, int height, int weight){
  super(firstName, lastName, gender, address);
  this.patientID = patientID;
  this.pHealth = new HealthInfo(height, weight);
  pHealth.calcBMI();
  System.out.println("Patient: " + super.getFullName() + " has been added.");
}

public String getPatientID(){
  return patientID;
}

public int getHeight(){
  return pHealth.getHeight();
}

public int getWeight(){
  return pHealth.getWeight();
}

public double getBMI(){
  return pHealth.getBMI();
}
  
}
