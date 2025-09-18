import java.util.Scanner;

/**
 * The PolicyDemo class interacts with the user to create a Policy object
 * and display its information.
 */
public class Project_Jonathan_Rivas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for policy information
        System.out.print("Enter Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Enter Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Enter Policyholder's First Name: ");
        String policyholderFirstName = scanner.nextLine();

        System.out.print("Enter Policyholder's Last Name: ");
        String policyholderLastName = scanner.nextLine();

        System.out.print("Enter Policyholder's Age: ");
        int policyholderAge = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Enter Policyholder's Height (in inches): ");
        double policyholderHeight = scanner.nextDouble();

        System.out.print("Enter Policyholder's Weight (in pounds): ");
        double policyholderWeight = scanner.nextDouble();

        // Create a Policy object using the parameterized constructor
        Policy policy = new Policy(policyNumber, providerName, policyholderFirstName,
                policyholderLastName, policyholderAge, smokingStatus,
                policyholderHeight, policyholderWeight);

        // Display the policy information
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

        scanner.close();
    }
}