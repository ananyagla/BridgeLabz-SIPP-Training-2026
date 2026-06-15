import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200; // Initial card balance

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            // Ternary Operator for Fare Calculation
            double fare = (distance <= 10) ? 20 :
                          (distance <= 20) ? 35 : 50;

            if (fare > balance) {
                System.out.println("Insufficient Balance!");
                break;
            }

            balance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        }

        System.out.println("Smart Card Session Ended.");
    }
    
}
