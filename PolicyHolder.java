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

    // Getters and Setters

    /**
     * Gets the policy number.
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     * @param policyNumber The new policy number.
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the provider name.
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the provider name.
     * @param providerName The new provider name.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the policyholder's first name.
     * @return The first name.
     */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /**
     * Sets the policyholder's first name.
     * @param policyholderFirstName The new first name.
     */
    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    /**
     * Gets the policyholder's last name.
     * @return The last name.
     */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /**
     * Sets the policyholder's last name.
     * @param policyholderLastName The new last name.
     */
    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    /**
     * Gets the policyholder's age.
     * @return The age.
     */
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    /**
     * Sets the policyholder's age.
     * @param policyholderAge The new age.
     */
    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    /**
     * Gets the policyholder's smoking status.
     * @return The smoking status ("smoker" or "non-smoker").
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the policyholder's smoking status.
     * @param smokingStatus The new smoking status.
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Gets the policyholder's height.
     * @return The height in inches.
     */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    /**
     * Sets the policyholder's height.
     * @param policyholderHeight The new height in inches.
     */
    public void setPolicyholderHeight(double policyholderHeight) {
        this.policyholderHeight = policyholderHeight;
    }

    /**
     * Gets the policyholder's weight.
     * @return The weight in pounds.
     */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    /**
     * Sets the policyholder's weight.
     * @param policyholderWeight The new weight in pounds.
     */
    public void setPolicyholderWeight(double policyholderWeight) {
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
}