import java.util.Random;


public class Quest5 {
    public static char RPS() {
        char[] hi = {'r','r','r','p','p','p','p','p','s','s','s','s','s','s'};
        Random rand = new Random();
        return hi[rand.nextInt(13)];
    }

    public static void main(String[] args) {
    }
}