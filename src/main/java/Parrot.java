public class Parrot implements Birds {

    @Override
    public void fly() {
        System.out.println("Parrot is Flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is Eating");
    }

    @Override
    public void speak() {
        System.out.println("Parrot is Speaking");
    }
}
