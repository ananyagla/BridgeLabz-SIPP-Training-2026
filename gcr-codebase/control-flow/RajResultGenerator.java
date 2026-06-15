import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        // Input marks using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;

        int gradeCode;

        if (average >= 90)
            gradeCode = 1;
        else if (average >= 75)
            gradeCode = 2;
        else if (average >= 60)
            gradeCode = 3;
        else
            gradeCode = 4;

        // Grade assignment using switch
        switch (gradeCode) {
            case 1:
                System.out.println("Grade: A");
                break;

            case 2:
                System.out.println("Grade: B");
                break;

            case 3:
                System.out.println("Grade: C");
                break;

            case 4:
                System.out.println("Grade: D");
                break;
        }

        System.out.println("Average Marks: " + average);
    }

    
}
