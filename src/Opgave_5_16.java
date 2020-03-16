import java.util.Scanner;

public class Opgave_5_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int n = input.nextInt();

        int i = 2;
        String s = "";

        while (n != 1) {
            if (n % i == 0){
                s = s + ", " + i;
                n = n / i;
                i = 2;
            }else {
                i++;
            }

        }

        System.out.println("The factors are:" + s.substring(2) + ".");

    }
}
