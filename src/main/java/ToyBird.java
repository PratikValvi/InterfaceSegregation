public class ToyBird implements Birds {

    @Override
    public void fly() {
        System.out.println( ToyBird.class.getName() + " flying using remote");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {
        System.out.println( ToyBird.class.getName() + " is speaking");
    }
}
