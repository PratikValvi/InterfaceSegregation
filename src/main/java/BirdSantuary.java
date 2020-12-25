import java.util.ArrayList;
import java.util.List;

public class BirdSantuary {
    List<Birds> birdsList = new ArrayList<>();
    public BirdSantuary() {
        Birds crow = BirdFactory.getInstance().getBird("Crow");
        birdsList.add(crow);

        Birds parrot = BirdFactory.getInstance().getBird("Parrot");
        birdsList.add(parrot);

        Birds pheonix = BirdFactory.getInstance().getBird("Pheonix");
        birdsList.add(pheonix);

        Birds toybird = BirdFactory.getInstance().getBird("ToyBird");
        birdsList.add(toybird);

        Birds penguin = BirdFactory.getInstance().getBird("Penguin");
        birdsList.add(penguin);
    }

    public List<Birds> getBirdList() {
        return this.birdsList;
    }
}
