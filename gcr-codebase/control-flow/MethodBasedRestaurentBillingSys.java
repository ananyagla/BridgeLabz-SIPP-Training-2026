import java.util.Scanner;

public class MethodBasedRestaurentBillingSys {
    static double calculateFoodCost(int quantity, double price) {
        return quantity * price;
    }

    static double calculateGST(double amount) {
        return amount * 0.18;
    }

    static double calculateDiscount(double amount) {
        if (amount > 1000)
            return amount * 0.10;
        return 0;
    }

    static double generateFinalBill(double foodCost,
                                    double gst,
                                    double discount) {
        return foodCost + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double foodCost = calculateFoodCost(quantity, price);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);
        double finalBill = generateFinalBill(foodCost, gst, discount);

        System.out.println("\n----- Restaurant Bill -----");
        System.out.println("Food Cost : ₹" + foodCost);
        System.out.println("GST       : ₹" + gst);
        System.out.println("Discount  : ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
    
}
