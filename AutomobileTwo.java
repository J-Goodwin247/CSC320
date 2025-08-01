import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single automobile in the dealership's inventory.
 * This class holds all the essential details about a vehicle.
 */
public class Automobile {

    // --- Attributes ---
    
    private String make; 
    private String model;
    private int year;    
    private String vin;   
    private String color;
    private int mileage;   
    private double price;     
    private boolean isNew; 
    private String engineType; 
    private String transmission; 
    private List<String> features; 
    private LocalDate dateAddedToInventory; 

    // --- Constructors ---

    /**
     * Default Constructor.
     * Creates an Automobile object with default, placeholder values.
     * This is useful for creating an object when the specific details are not yet known
     * and will be set later using setter methods.
     */
    public Automobile() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.vin = "Not Specified";
        this.color = "Unpainted";
        this.mileage = 0;
        this.price = 0.0;
        this.isNew = true;
        this.engineType = "Unknown";
        this.transmission = "Unknown";
        this.features = new ArrayList<>();
        this.dateAddedToInventory = LocalDate.now();
    }

    /**
     * Parameterized Constructor.
     * Creates an Automobile object with specific values provided as arguments.
     * This is the most common way to create a new object, as it initializes
     * it with all its necessary data at the time of creation.
     *
     * @param make         The manufacturer of the car.
     * @param model        The model of the car.
     * @param year         The model year.
     * @param vin          The Vehicle Identification Number.
     * @param color        The exterior color.
     * @param mileage      The current mileage.
     * @param price        The selling price.
     * @param isNew        The condition (true for new, false for used).
     * @param engineType   The type of engine.
     * @param transmission The type of transmission.
     */
    public Automobile(String make, String model, int year, String vin, String color, int mileage, double price, boolean isNew, String engineType, String transmission) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.isNew = isNew;
        this.engineType = engineType;
        this.transmission = transmission;
        this.features = new ArrayList<>(); // Initialize as empty, features can be added later
        this.dateAddedToInventory = LocalDate.now();
    }

    // --- Getters and Setters (Accessors and Mutators) ---

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isNew() { return isNew; }
    public void setNew(boolean aNew) { isNew = aNew; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    public String getTransmission() { return transmission; }
    public void setTransmission(String transmission) { this.transmission = transmission; }

    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }
    
    public LocalDate getDateAddedToInventory() { return dateAddedToInventory; }
    public void setDateAddedToInventory(LocalDate dateAddedToInventory) { this.dateAddedToInventory = dateAddedToInventory; }

    // --- Behavior Methods ---

    //adding a feature
    public void addFeature(String feature) {
        if (this.features != null && !feature.trim().isEmpty()) {
            this.features.add(feature);
        }
    }

    // removing a feature
    public boolean removeFeature(String feature) {
        if (this.features != null) {
            return this.features.remove(feature);
        }
        return false;
    }

    //edit a feature
    public boolean editFeature(String oldFeature, String newFeature) {
        if (this.features == null || oldFeature == null || newFeature == null || newFeature.trim().isEmpty()) {
            return false;
        }
        int index = this.features.indexOf(oldFeature);
        if (index != -1) { // -1 means the feature was not found
            this.features.set(index, newFeature);
            return true;
        }
        return false;
    }

    /**
     * A simple method to display the details of the car.
     * @return A formatted string with the car's information.
     */
    @Override
    public String toString() {
        return "Automobile{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", mileage=" + mileage +
                ", price=$" + String.format("%.2f", price) +
                ", isNew=" + isNew +
                ", features=" + features +
                ", dateAddedToInventory=" + dateAddedToInventory +
                '}';
    }
}
