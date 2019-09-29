public class Opgave_5_11 {
    public static void main(String[] args) {

        int linecount = 0;

        for (int i = 100; i < 200 ; i++) {
            if (i % 3 == 0 || i % 4 == 0){
                System.out.println(i + " ");
                linecount +=1;

                if (linecount == 10){
                    System.out.println(" \n ");
                    linecount = 0;
                }
            }

        }
    }
}
