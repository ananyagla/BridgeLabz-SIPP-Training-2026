import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input weight in kg
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        // Input height in meters
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        // BMI Calculation
        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        // Category Check
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
    }
    
}
