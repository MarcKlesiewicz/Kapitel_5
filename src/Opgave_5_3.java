public class Opgave_5_3 {
    public static void main(String[] args) {

        System.out.println("Celsius     Fahrenheit");


        for (int c = 0; c <= 100 ; c = c + 2) {
            double faren = c * 9/5 + 32;
            System.out.println(c + "           " + faren);

        }
    }
}
