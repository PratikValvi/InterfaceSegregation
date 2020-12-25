public class BirdFactory {
    static BirdFactory instance;

    private BirdFactory() {

    }

    public static BirdFactory getInstance() {
        if (instance == null) {
            instance = new BirdFactory();
        }
        return instance;
    }

    public Birds getBird(String birdName) {
        Birds bird;
        switch (birdName) {
            case "Crow":
                bird = new Crow();
                break;
            case "Parrot":
                bird = new Parrot();
                break;
            case "Pheonix":
                bird = new Pheonix();
                break;
            case "Penguin":
                bird = new Penguin();
                break;
            case "ToyBird":
                bird = new ToyBird();
                break;
            default:
                bird = null;
        }
        return bird;
    }
}
