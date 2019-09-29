import java.util.Scanner;

public class Opgave_5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Enter your score:");
        int score = input.nextInt();

        if (score >= 60)
            System.out.println("Your pass the exam.");
        else if (score < 60 && score>=0)
            System.out.println("You don't pass the exam.");
        else
            System.out.println("No number are entered except 0");


    }
}
