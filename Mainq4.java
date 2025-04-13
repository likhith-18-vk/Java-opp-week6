import java.util.Scanner;
class College {
    String name;
    int qualification;
    int percentage;
    // Constructor
    College(String name, int qualification, int percentage) {
        this.name = name;
        this.qualification = qualification;
        this.percentage = percentage;
    }
    // Default Eligibility method
    public void Eligibility() {
        System.out.println("Name: " + name + ", Qualification: " + qualification + ", Percentage: " + percentage);
        System.out.println("The candidate is a fluke");
    }
}
class UG extends College {
    UG(String name, int qualification, int percentage) {
        super(name, qualification, percentage);
    }
    @Override
    public void Eligibility() {
        System.out.println("Name: " + name + ", Qualification: " + qualification + ", Percentage: " + percentage);
        System.out.println("The candidate is eligible for UG");
    }
}
class PG extends College {
    PG(String name, int qualification, int percentage) {
        super(name, qualification, percentage);
    }
    @Override
    public void Eligibility() {
System.out.println("Name: " + name + ", Qualification: " + qualification + ", Percentage: " + percentage);
        System.out.println("The candidate is eligible for PG");
    }
}
public class Mainq4 {
    public static void main(String[] args) {
        System.out.println("P.SAI LIKITH,24306, CSE-A");
        Scanner input = new Scanner(System.in);
        // Taking inputs
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your qualification (e.g., 12 for high school, 10 for 10th, etc.):");
        int qualification = input.nextInt();
        System.out.println("Enter your percentage:");
        int percentage = input.nextInt();
        // Close scanner
        input.close();
        // Logic to check eligibility
        College candidate;
        if (percentage >= 70) {
            candidate = new PG(name, qualification, percentage);
        } else if (percentage >= 60) {
            candidate = new UG(name, qualification, percentage);
        } else {
            candidate = new College(name, qualification, percentage);
        }
        candidate.Eligibility();
    }
}

