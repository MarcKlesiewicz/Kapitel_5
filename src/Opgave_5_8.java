import java.util.Scanner;

public class Opgave_5_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int highscore = 0;
        String studentHigh = "";

        System.out.println("Enter number of students:");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student's name and score");
        for (int i = 0; i < numberOfStudents ; i++) {
            System.out.println("Student " + (i+1) + " name:");
            String name = input.next();
            System.out.println(name + "'s score:" );
            int score = input.nextInt();

            if (score > highscore){

                highscore = score;
                studentHigh = name;
            }

        }
        System.out.println("Student with the highest score is: " + studentHigh  );
    }
}
