public class ToyBird implements Birds,Flyable {

    @Override
    public void speak() {
        System.out.println(ToyBird.class.getName() + " is speaking");
    }

    @Override
    public void fly() {
        System.out.println(ToyBird.class.getName() + " is flying");
    }
}
