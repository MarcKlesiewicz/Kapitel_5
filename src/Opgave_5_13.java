public class Opgave_5_13 {
    public static void main(String[] args) {

        int n = 12000;
        while (Math.pow(n,2) >= 12000){
            n--;
        }

        System.out.println("The smallest n is " + n + " for n^2 to be less than 12000");

    }
}
