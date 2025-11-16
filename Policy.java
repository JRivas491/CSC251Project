/**
 * The Policy class models an insurance policy and collaborates with the PolicyHolder class.
 */
public class Policy {

    // Static field to keep track of the number of Policy objects created
    private static int policyCount = 0;

    // Policy-specific attributes
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; 

    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        setPolicyNumber(policyNumber);
        setProviderName(providerName);
        setPolicyHolder(policyHolder);
        incrementPolicyCount();
    }

    // Getters and Setters with Validation

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) {
        if (policyNumber == null || policyNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Policy number cannot be empty.");
        }
        this.policyNumber = policyNumber.trim();
    }
    
    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) {
         if (providerName == null || providerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Provider name cannot be empty.");
        }
        this.providerName = providerName.trim();
    }
    
    public PolicyHolder getPolicyHolder() { return policyHolder; }
    public void setPolicyHolder(PolicyHolder policyHolder) {
        if (policyHolder == null) {
            throw new IllegalArgumentException("PolicyHolder object cannot be null.");
        }
        this.policyHolder = policyHolder;
    }
    
    // Private method to safely manage the static count
    private static void incrementPolicyCount() {
        policyCount++;
    }

    /**
     * Gets the total number of Policy objects created
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    // calculatePrice and toString methods

    public double calculatePrice() {
        double price = 600.0; 

        if (policyHolder.getAge() > 50) {
            price += 75.0;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = policyHolder.calculateBMI(); 
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }

    @Override
    public String toString() {
        return String.format(
            "Policy Number: %s\n" +
            "Provider Name: %s\n" +
            "---------- Policyholder Details ----------\n%s\n" + 
            "----------------------------------------\n" +
            "Policy Price: $%.2f",
            policyNumber,
            providerName,
            policyHolder.toString(),
            calculatePrice()
        );
    }
}