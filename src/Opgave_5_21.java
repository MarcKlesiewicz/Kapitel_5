import java.text.DecimalFormat;
import java.util.Scanner;

public class Opgave_5_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan amount:");
        double l = input.nextDouble();
        System.out.println("Enter number of years:");
        int y = input.nextInt();

        System.out.printf("%-9s%15s%21s\n", "Rate", "Month", "Total");


        for (double i = 5.00; i <= 10.00 ; i += 0.25) {

            double totalPay = l * ((i/100)+1);
            double monthPay = totalPay / (y*12);


            System.out.printf("%-9s%15s%21s\n", i + "%", monthPay, totalPay);

        }


    }
}
