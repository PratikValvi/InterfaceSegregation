public class ToyBird implements Birds,Flyable {

    @Override
    public void speak() {
        System.out.println(ToyBird.class.getSimpleName() + " is speaking");
    }

    @Override
    public void fly() {
        System.out.println(ToyBird.class.getSimpleName() + " is flying");
    }
}
