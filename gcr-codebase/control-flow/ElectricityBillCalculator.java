import java.util.Scanner;

public class ElectricityBillCalculator {
    static int acceptUnits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }

    static double calculateBill(int units) {
        return units * 8.5; // ₹8.5 per unit
    }

    static void displayBill(int units, double bill) {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount    : ₹" + bill);
    }

    public static void main(String[] args) {
        int units = acceptUnits();
        double bill = calculateBill(units);
        displayBill(units, bill);
    }
    
}
