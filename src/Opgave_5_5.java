public class Opgave_5_5 {
    public static void main(String[] args) {



        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");


        for (int c = 0; c <= 100 ; c = c + 2) {
            for (int f = 20; f <= 270 ; f = f + 5) {
                double faren = c * 9/5 + 32;
                double celsi = (f - 32) * (9/5);

                System.out.println(c + "           " + faren + "           |       " + f + "           " + celsi );


            }



        }
    }
}
