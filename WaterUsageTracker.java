import java.util.Scanner;

public class WaterUsageTracker {

    // Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning and evening usage
        System.out.print("Enter morning water usage (litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = scanner.nextInt();

        // Call method and display total consumption
        int totalConsumption = calculateTotal(morning, evening);
        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        scanner.close();
    }
}