import java.util.Scanner;

public class Opgave_5_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount");
        int amount = input.nextInt();

        System.out.println("Enter an annual interest");
        double interest = input.nextDouble();
        double monthlyInt = (interest / 100) / 12;

        System.out.println("Enter number of month");
        int month = input.nextInt();

        double comValue = amount * (1 + monthlyInt);

        System.out.println("Amount in saving " + comValue );

        for (int i = 1; i < month ; i++) {

            double newBalance = 100 + comValue * (1 + monthlyInt);
            System.out.println("Amount in saving " + newBalance);
            comValue = newBalance;


        }


    }
}
