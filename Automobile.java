public class Automobile {
	
	//information for each vehicle
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
            		this.year = 0;
            		this.mileage = 0;
        	} catch (Exception e) {
            		System.out.println("Error in default constructor: " + e.getMessage());
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
			System.out.println("Error in parameterized constructor: " + e.getMessage());
		}
	}

	public String addNewVehicle(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
			return "Vehicle added successfully.";
		} catch (Exception e) {
			return "Could not add vehicle. Error: " + e.getMessage();
		}
	}

	public String[] listVehicleInformation() {
		try{
			String[] info = new String[5];
			info[0] = "Make: " + this.make;
			info[1] = "Model: " + this.model;
			info[2] = "Color: " + this.color;
			info[3] = "Year: " + this.year;
			info[4] = "Mileage: " + this.mileage;
			return info;
		} catch (Exception e) {
			return new String[]{"Could not retireve vehicle info. Error: " +e.getMessage()};
		}
	}

	public String removeVehicle() {
		try {
			this.make = "N/A";
			this.model = "N/A";
			this.color = "N/A";
			this.year = 0;
			this.mileage = 0;
			return "Vehicle information deleted.";
		} catch (Exception e) {
			return "Vehicle information failed to delete. Error: " + e.getMessage();
		}
	}

	public String updateVehicleInformation(String newColor, int newMileage) {
		try {
			if (newMileage < this.mileage) {
				throw new Exception("New mileage can't be less than current mileage");
			}
			this.color = newColor;
			this.mileage = newMileage;
			return "Vehicle information updated successfully.";
		} catch (Exception e) {
			return "Could not update vehicle information. Error: " + e.getMessage();
		}
	}
}
	
