import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Birds> birdsList = new ArrayList<>();
        Birds crow = new Crow();
        birdsList.add(crow);

        Birds parrot = new Parrot();
        birdsList.add(parrot);

        Birds pheonix = new Pheonix();
        birdsList.add(pheonix);

        Birds toybird = new ToyBird();
        birdsList.add(toybird);

        Birds penguin = new Penguin();
        birdsList.add(penguin);

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
