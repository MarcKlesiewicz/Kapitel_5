public class Opgave_5_12 {
    public static void main(String[] args) {

        int n = 1;
        while (Math.pow(n,3) <= 12000){
            n++;
        }

        System.out.println("The smallest n is " + n + " for n^3 to be greater than 12000");

    }
}
