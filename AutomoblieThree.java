import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    // Default Constructor.
    public Automobile() {
        try {
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
        } catch (Exception e) {
            System.err.println("Error during default object construction: " + e.getMessage());
        }
    }

    // Parameterized Constructor.
    public Automobile(String make, String model, int year, String vin, String color, int mileage, double price, boolean isNew, String engineType, String transmission) {
        try {
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
            this.features = new ArrayList<>();
            this.dateAddedToInventory = LocalDate.now();
        } catch (Exception e) {
            System.err.println("Error during parameterized object construction: " + e.getMessage());
        }
    }

    // --- Getters and Setters ---

    public String getMake() {
        try {
            return this.make;
        } catch (Exception e) {
            System.err.println("Failure retrieving make: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the make of the automobile.

    public String setMake(String make) {
        try {
            this.make = make;
            return "Success: Make has been set to '" + make + "'.";
        } catch (Exception e) {
            return "Failure: Could not set make. " + e.getMessage();
        }
    }

    public String getModel() {
        try {
            return this.model;
        } catch (Exception e) {
            System.err.println("Failure retrieving model: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the model of the automobile.

    public String setModel(String model) {
        try {
            this.model = model;
            return "Success: Model has been set to '" + model + "'.";
        } catch (Exception e) {
            return "Failure: Could not set model. " + e.getMessage();
        }
    }

    public int getYear() {
        try {
            return this.year;
        } catch (Exception e) {
            System.err.println("Failure retrieving year: " + e.getMessage());
            return 0;
        }
    }

    // Sets the year of the automobile.

    public String setYear(int year) {
        try {
            if (year < 1886 || year > LocalDate.now().getYear() + 2) {
                return "Failure: Year is not valid.";
            }
            this.year = year;
            return "Success: Year has been set to " + year + ".";
        } catch (Exception e) {
            return "Failure: Could not set year. " + e.getMessage();
        }
    }

    public String getVin() {
        try {
            return this.vin;
        } catch (Exception e) {
            System.err.println("Failure retrieving VIN: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the VIN of the automobile.

    public String setVin(String vin) {
        try {
            this.vin = vin;
            return "Success: VIN has been set.";
        } catch (Exception e) {
            return "Failure: Could not set VIN. " + e.getMessage();
        }
    }

    public String getColor() {
        try {
            return this.color;
        } catch (Exception e) {
            System.err.println("Failure retrieving color: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the color of the automobile.

    public String setColor(String color) {
        try {
            this.color = color;
            return "Success: Color has been set to '" + color + "'.";
        } catch (Exception e) {
            return "Failure: Could not set color. " + e.getMessage();
        }
    }

    public int getMileage() {
        try {
            return this.mileage;
        } catch (Exception e) {
            System.err.println("Failure retrieving mileage: " + e.getMessage());
            return -1;
        }
    }

    // Sets the mileage of the automobile.

    public String setMileage(int mileage) {
        try {
            if (mileage < 0) {
                return "Failure: Mileage cannot be negative.";
            }
            this.mileage = mileage;
            return "Success: Mileage has been set to " + mileage + ".";
        } catch (Exception e) {
            return "Failure: Could not set mileage. " + e.getMessage();
        }
    }

    public double getPrice() {
        try {
            return this.price;
        } catch (Exception e) {
            System.err.println("Failure retrieving price: " + e.getMessage());
            return -1.0;
        }
    }

    // Sets the price of the automobile.

    public String setPrice(double price) {
        try {
            if (price < 0) {
                return "Failure: Price cannot be negative.";
            }
            this.price = price;
            return "Success: Price has been set to $" + String.format("%.2f", price) + ".";
        } catch (Exception e) {
            return "Failure: Could not set price. " + e.getMessage();
        }
    }

    public boolean isNew() {
        try {
            return this.isNew;
        } catch (Exception e) {
            System.err.println("Failure retrieving new status: " + e.getMessage());
            return false;
        }
    }

    // Sets the condition of the automobile.

    public String setNew(boolean isNew) {
        try {
            this.isNew = isNew;
            return "Success: Condition has been set to '" + (isNew ? "New" : "Used") + "'.";
        } catch (Exception e) {
            return "Failure: Could not set condition. " + e.getMessage();
        }
    }

    public String getEngineType() {
        try {
            return this.engineType;
        } catch (Exception e) {
            System.err.println("Failure retrieving engine type: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the engine type of the automobile.

    public String setEngineType(String engineType) {
        try {
            this.engineType = engineType;
            return "Success: Engine type has been set to '" + engineType + "'.";
        } catch (Exception e) {
            return "Failure: Could not set engine type. " + e.getMessage();
        }
    }

    public String getTransmission() {
        try {
            return this.transmission;
        } catch (Exception e) {
            System.err.println("Failure retrieving transmission: " + e.getMessage());
            return "Error";
        }
    }

    // Sets the transmission type of the automobile.

    public String setTransmission(String transmission) {
        try {
            this.transmission = transmission;
            return "Success: Transmission has been set to '" + transmission + "'.";
        } catch (Exception e) {
            return "Failure: Could not set transmission. " + e.getMessage();
        }
    }

    public List<String> getFeatures() {
        try {
            return this.features;
        } catch (Exception e) {
            System.err.println("Failure retrieving features: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list on failure
        }
    }

    // Sets the features list for the automobile.

    public String setFeatures(List<String> features) {
        try {
            this.features = features;
            return "Success: Features list has been set.";
        } catch (Exception e) {
            return "Failure: Could not set features list. " + e.getMessage();
        }
    }

    public LocalDate getDateAddedToInventory() {
        try {
            return this.dateAddedToInventory;
        } catch (Exception e) {
            System.err.println("Failure retrieving inventory date: " + e.getMessage());
            return null;
        }
    }

    // Sets the date the automobile was added to inventory.

    public String setDateAddedToInventory(LocalDate dateAddedToInventory) {
        try {
            this.dateAddedToInventory = dateAddedToInventory;
            return "Success: Inventory date has been set to " + dateAddedToInventory + ".";
        } catch (Exception e) {
            return "Failure: Could not set inventory date. " + e.getMessage();
        }
    }

    // --- Behavior Methods ---

    // Adds a single feature to the automobile's feature list.

    public String addFeature(String feature) {
        try {
            if (this.features != null && feature != null && !feature.trim().isEmpty()) {
                this.features.add(feature);
                return "Success: Feature '" + feature + "' added.";
            } else {
                return "Failure: Cannot add null or empty feature.";
            }
        } catch (Exception e) {
            return "Failure: An error occurred while adding the feature. " + e.getMessage();
        }
    }

    // Removes a single feature from the automobile's feature list.

    public String removeFeature(String feature) {
        try {
            if (this.features != null && feature != null) {
                boolean removed = this.features.remove(feature);
                if (removed) {
                    return "Success: Feature '" + feature + "' removed.";
                } else {
                    return "Failure: Feature '" + feature + "' not found.";
                }
            } else {
                return "Failure: Feature list is not initialized or feature is null.";
            }
        } catch (Exception e) {
            return "Failure: An error occurred while removing the feature. " + e.getMessage();
        }
    }

    // Edits an existing feature in the automobile's feature list.

    public String editFeature(String oldFeature, String newFeature) {
        try {
            if (this.features == null || oldFeature == null || newFeature == null || newFeature.trim().isEmpty()) {
                return "Failure: Cannot edit feature due to invalid input.";
            }
            int index = this.features.indexOf(oldFeature);
            if (index != -1) { // -1 means the feature was not found
                this.features.set(index, newFeature);
                return "Success: Feature '" + oldFeature + "' was changed to '" + newFeature + "'.";
            } else {
                return "Failure: Feature '" + oldFeature + "' not found.";
            }
        } catch (Exception e) {
            return "Failure: An error occurred while editing the feature. " + e.getMessage();
        }
    }

    // Method to display the details of the car, with error handling.
    @Override
    public String toString() {
        try {
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
        } catch (Exception e) {
            return "Failure: Could not generate string representation for Automobile object. " + e.getMessage();
        }
    }
}
