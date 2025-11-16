public class PolicyHolder {

    // Static fields to keep track of counts across all instances
    private static int smokerCount = 0;
    private static int nonSmokerCount = 0;

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; 
    private double height; 
    private double weight; 

    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus,
                        double height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSmokingStatus(smokingStatus);
        setHeight(height);
        setWeight(weight);
        if (this.smokingStatus.equalsIgnoreCase("smoker")) {
            incrementSmokerCount();
        } else {
            incrementNonSmokerCount();
        }
    }
    
    private static void incrementSmokerCount() {
        smokerCount++;
    }

    private static void incrementNonSmokerCount() {
        nonSmokerCount++;
    }

    public static int getSmokerCount() {
        return smokerCount;
    }

    public static int getNonSmokerCount() {
        return nonSmokerCount;
    }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.firstName = firstName.trim();
    }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName.trim();
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0 || age > 120) { 
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.age = age;
    }
    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) {
        if (smokingStatus == null || (!smokingStatus.equalsIgnoreCase("smoker") && !smokingStatus.equalsIgnoreCase("non-smoker"))) {
            throw new IllegalArgumentException("Smoking status must be 'smoker' or 'non-smoker'.");
        }
        this.smokingStatus = smokingStatus.toLowerCase(); 
    }
    public double getHeight() { return height; }
    public void setHeight(double height) {
        if (height <= 0) {
             throw new IllegalArgumentException("Height must be a positive value.");
        }
        this.height = height;
    }
    public double getWeight() { return weight; }
    public void setWeight(double weight) {
         if (weight <= 0) {
             throw new IllegalArgumentException("Weight must be a positive value.");
        }
        this.weight = weight;
    }
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    @Override
    public String toString() {
        return String.format(
            "Name: %s %s\n" +
            "Age: %d\n" +
            "Smoking Status: %s\n" +
            "Height: %.1f inches\n" +
            "Weight: %.1f pounds\n" +
            "BMI: %.2f",
            firstName, lastName, age, smokingStatus, height, weight, calculateBMI()
        );
    }
}