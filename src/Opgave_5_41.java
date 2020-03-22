import java.util.Scanner;

public class Opgave_5_41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int i;
        int max = 0;
        int count = 0;

        while ((i = input.nextInt()) != 0){

            if (i > max){
                max = i;
                count = 1;
            }else if (i == max){
                count++;
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
