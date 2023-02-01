import java.util.Random;
public class CoinFlip  {
    public static void main(String[] args) {
        // create a new random number generator object
        Random rand = new Random();
    
        // pick a random number between 0 and 1:

        int n = rand.nextInt(2);
        if (n == 0) {
            System.out.println("Heads");
            System.out.println("Picked random value " + n);
        } else {
            System.out.println("Tails ");
            System.out.println("Picked random value " + n);
        }
        
}
}