import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class DailyExpenseLogger {
     public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        int amount = sc.nextInt();

        BufferedWriter bw =
                new BufferedWriter(new FileWriter("expenses.txt", true));

        bw.write(category + " - " + amount);
        bw.newLine();

        bw.close();

        System.out.println("Expense Saved");
    }
    
}
