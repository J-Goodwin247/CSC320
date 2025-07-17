public class Automobile {
  
  private String make;
  private String model;
  private String color;
  private int year;
  private int mileage;
 
  public Automobile() {
    try {
      this.make = "N/A";
      this.model = "N/A";
      this.color = "N/A";
      this year = 0;
      this.mileage = 0:
    } catch (Exception e) {
        System.out.println("Error in default constructor: " +e.getMessage());
    }
  }

  public Automobile(String make, String model, String color, int year, int mileage) {
    try {
      this.make = make;
      this.model = model;
      this.color = color;
      this.year = year;
      this.mileage = mileage;
    } catch (Exception e) {
      System.out.println("Error in parameterized contructor: " + e.getMessage());
    }
  }
