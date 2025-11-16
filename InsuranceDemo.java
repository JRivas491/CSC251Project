public class InsuranceDemo {
    public static void main(String[] args) {
        // Create PolicyHolder objects (counts are incremented in constructor)
        PolicyHolder holder1 = new PolicyHolder("Alice", "Jones", 20, "smoker", 65, 110);
        PolicyHolder holder2 = new PolicyHolder("Bob", "Lee", 54, "non-smoker", 72, 200);
        PolicyHolder holder3 = new PolicyHolder("Chester", "Williams", 40, "smoker", 71, 300);

        // Create Policy objects (policy count is incremented here)
        Policy policy1 = new Policy("3450", "State Farm", holder1);
        Policy policy2 = new Policy("3455", "Aetna", holder2);
        Policy policy3 = new Policy("2450", "Met Life", holder3);

        // Print details of one policy using implicit toString call
        System.out.println(policy1); 
        
        // Print the final static counts
        System.out.println("\n----------------------------------------");
        System.out.println("Total number of policies created: " + Policy.getPolicyCount());
        System.out.println("Total number of smokers: " + PolicyHolder.getSmokerCount());
        System.out.println("Total number of non-smokers: " + PolicyHolder.getNonSmokerCount());
    }
}