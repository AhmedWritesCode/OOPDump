public class HealthInfo {

  private int height;
  private int weight;
  private double bmi;

  public HealthInfo(int height, int weight){
    this.height = height;
    this.weight = weight;
    calcBMI();
  }

  public void calcBMI(){
    double heightInMeters = height / 100.0;
    bmi = weight / (heightInMeters * heightInMeters);  }

  public int getHeight(){
    return height;
  }

  public int getWeight(){
    return weight;
  }

  public double getBMI(){
    return bmi;
  }
  
}
