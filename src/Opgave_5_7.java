public class Opgave_5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;

        while ( year < 10){
            tuition = tuition * 1.06;
            year++;
        }
        double year11 = tuition * 1.06;
        double year12 = year11 * 1.06 ;
        double year13 = year12 * 1.06;
        double year14 = year13 * 1.06;


        System.out.println("The cost of four years' worth of tuition after the first ten years is " + (year11+year12+year13+year14) + "$" );
    }
}
