/**
 * The PolicyHolder class models a person associated with an insurance policy.
 */
public class PolicyHolder {

    // Attributes for the policyholder
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus; // "smoker" or "non-smoker"
    private double policyholderHeight; // in inches
    private double policyholderWeight; // in pounds

    /**
     * No-argument constructor.
     * Sets default values for all attributes.
     */
    public PolicyHolder() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyholderFirstName = "";
        this.policyholderLastName = "";
        this.policyholderAge = 0;
        this.smokingStatus = "non-smoker";
        this.policyholderHeight = 0.0;
        this.policyholderWeight = 0.0;
    }

    /**
     * Parameterized constructor.
     *
     * @param policyNumber The policy number.
     * @param providerName The provider's name.
     * @param policyholderFirstName The policyholder's first name.
     * @param policyholderLastName The policyholder's last name.
     * @param policyholderAge The policyholder's age.
     * @param smokingStatus The policyholder's smoking status.
     * @param policyholderHeight The policyholder's height in inches.
     * @param policyholderWeight The policyholder's weight in pounds.
     */
    public PolicyHolder(String policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String smokingStatus,
                  double policyholderHeight, double policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.smokingStatus = smokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    /**
     * Calculates and returns the BMI of the policyholder.
     * BMI = (Policyholder’s Weight * 703) / (Policyholder’s Height^2)
     *
     * @return The calculated BMI as a double.
     */
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    /**
     * Calculates and returns the price of the insurance policy.
     *
     * @return The calculated policy price as a double.
     */
    public double calculatePrice() {
        double price = 600.0; // Base fee

        if (policyholderAge > 50) {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }

    /**
     * Returns a string representation of the PolicyHolder object.
     * @return A formatted string with policyholder details, BMI, and policy price.
     */
    @Override
    public String toString() {
        // Use String.format for clean formatting of the output
        return String.format(
            "Policy Number: %s\n" +
            "Provider Name: %s\n" +
            "Policyholder's First Name: %s\n" +
            "Policyholder's Last Name: %s\n" +
            "Policyholder's Age: %d\n" +
            "Policyholder's Smoking Status: %s\n" +
            "Policyholder's Height: %.1f inches\n" +
            "Policyholder's Weight: %.1f pounds\n" +
            "Policyholder's BMI: %.2f\n" +
            "Policy Price: $%.2f",
            policyNumber,
            providerName,
            policyholderFirstName,
            policyholderLastName,
            policyholderAge,
            smokingStatus,
            policyholderHeight,
            policyholderWeight,
            calculateBMI(),
            calculatePrice()
        );
    }
}