import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The PolicyDemo class reads insurance policy data from a file
 * and displays its information.
 */
public class Project_Jonathan_Rivas {

    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        File file = new File("Policy_Information.txt");
        /**
         * Below reads the file from the local folder.
         * If the file is saved elsewhere, it would need to be pointed there
         */
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String policyNumber = scanner.nextLine();
                if (policyNumber.trim().isEmpty()) {
                    continue; // Skip to the next iteration if the line is empty
                }
                String providerName = scanner.nextLine();
                String policyholderFirstName = scanner.nextLine();
                String policyholderLastName = scanner.nextLine();
                int policyholderAge = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline
                String smokingStatus = scanner.nextLine();
                double policyholderHeight = scanner.nextDouble();
                double policyholderWeight = scanner.nextDouble();

                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // Consume blank line between policies
                }

                // Create a Policy object and add it to the ArrayList
                Policy policy = new Policy(policyNumber, providerName, policyholderFirstName,
                        policyholderLastName, policyholderAge, smokingStatus,
                        policyholderHeight, policyholderWeight);
                policies.add(policy);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file 'Policy_Information.txt' was not found.");
            e.printStackTrace();
            return;
        }

        // Initialize for smokers and non-smokers
        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Display the policy information
        for (Policy policy : policies) {
            // Check the smoking status and update the appropriate counter
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
            
            System.out.println("\n-------------------------------------------");
            System.out.println("Policy Information:");
            System.out.println("-------------------------------------------");
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());
            System.out.println("-------------------------------------------");
        }
        
        // Display the final counts
        System.out.println("\nNumber of Policyholders who are smokers: " + smokerCount);
        System.out.println("Number of Policyholders who are non-smokers: " + nonSmokerCount);
    }
}