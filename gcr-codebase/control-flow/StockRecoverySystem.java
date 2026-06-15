import java.util.Scanner;

public class StockRecoverySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        int zeroIndex = -1;
        int sum = 0;
        int count = 0;

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();

            if (stock[i] == 0) {
                zeroIndex = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int average = sum / count;

        stock[zeroIndex] = average;

        System.out.println("Missing stock found at position: " + (zeroIndex + 1));
        System.out.println("Average stock: " + average);

        System.out.println("Updated Inventory:");

        for (int s : stock) {
            System.out.print(s + " ");
        }
    }
    
}
