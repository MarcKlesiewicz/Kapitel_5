public class Opgave_5_15 {
    public static void main(String[] args) {

        for (char i = '!'; i <= '~'; i++) {

            System.out.println(i + " ");
            if ((i - 32) % 10 == 0){
                System.out.println("");
            }

        }
    }
}
