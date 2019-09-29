import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opgave_5_2 {
    public static void main(String[] args) {

        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){

            int number1 = (int)(Math.random() * 12);
            int number2 = (int)(Math.random() * 12);

            System.out.println("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong " + number1 + " + " + number2 + " is " + (number1 + number2));
            count++;

            output += " " + number1 + " + " + number2 + " = " + answer + ((number1+number2 == answer) ? " correct": " wrong");
        }

        long endtime = System.currentTimeMillis();
        long testTime = endtime - startTime;

        System.out.println(" ");
        System.out.println("Correct count is " + correctCount);
        System.out.println("Test time is " + testTime / 1000 + " seconds ");
        System.out.println(output);
    }

}
