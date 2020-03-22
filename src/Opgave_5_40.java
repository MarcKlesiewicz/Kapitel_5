public class Opgave_5_40 {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 2000000 ; i++) {

            int rand = (int)(Math.random()*2);

            if (rand == 1){
                heads++;
            }else{
                tails++;
            }

        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
