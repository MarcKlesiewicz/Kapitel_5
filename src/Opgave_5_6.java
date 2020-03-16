public class Opgave_5_6 {

    public static void main(String[] args) {

        final int END = 80;
        final int SQRMETER_START = 30;

        System.out.printf("%-9s%15s", "Ping", "Square meter");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "Square meter", "Ping");;

        for (int p = 10, s = 30; p <= END ; p += 5, s += 5) {
            System.out.printf("%-9d%15.3f", p, p * 3.305);
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.3f\n", s, s / 3.305);

        }
    }
}