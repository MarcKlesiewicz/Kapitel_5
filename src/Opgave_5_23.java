public class Opgave_5_23 {
    public static void main(String[] args) {

        final int N = 50000;
        double sumLToR =0, sumRToL = 0;


        for(int i=1 ; i<=N; i++){
            sumLToR = sumLToR+ 1.0/i;
            sumRToL = sumRToL+ 1.0/(N-i+1);

        }

        System.out.println("Summation from left to right:" + sumLToR);
        System.out.println("Summation from right to left:" + sumRToL);
    }



}

