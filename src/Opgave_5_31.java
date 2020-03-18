import java.util.Scanner;

public class Opgave_5_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount:");
        double amount = input.nextDouble();
        System.out.println("Enter an annual percentage yield:");
        double apy = input.nextDouble();
        System.out.println("Enter maturity period (number of month):");
        int month = input.nextInt();

        int monthCounter = month - month;

        System.out.printf("%-9s%15s\n", "Month", "CD Value");

        for (int i = 0; i < month ; i++) {

            double newAmount = amount + (amount * (apy / 1200));
            amount = newAmount;

            monthCounter++;

            System.out.printf("%-9s%15s\n", monthCounter, amount);




        }


    }
}
