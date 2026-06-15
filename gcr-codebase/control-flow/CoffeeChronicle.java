import java.util.Scanner;

public class CoffeeChronicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or exit: ");
            String coffee = sc.next();

            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int price = 0;

            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double bill = price * qty;
            double gst = bill * 0.18; // 18% GST
            double total = bill + gst;

            System.out.println("Bill Amount: ₹" + bill);
            System.out.println("GST: ₹" + gst);
            System.out.println("Total Amount: ₹" + total);
            System.out.println();
        }

        System.out.println("Cafe Closed!");
    }
    
}
