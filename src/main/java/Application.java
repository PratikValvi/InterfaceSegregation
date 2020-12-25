import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        BirdSantuary birdSantuary = new BirdSantuary();
        List<Birds> birdsList = birdSantuary.getBirdList();
        for (Birds bird : birdsList) {
            System.out.println(bird.getClass());
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
            if (bird instanceof Eatable) {
                ((Eatable) bird).eat();
            }
            bird.speak();
            System.out.println();
        }
    }
}
