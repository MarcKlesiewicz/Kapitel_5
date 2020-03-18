public class Opgave_5_35 {
    public static void main(String[] args) {

        final int END = 1000;

        for (int i = 1, j = 2; j <= END ; i++, j++ ) {

            System.out.println(1 / (Math.sqrt(i) + Math.sqrt(j)));

        }
    }
}
