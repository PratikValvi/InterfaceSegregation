public class Pheonix implements Birds {
    @Override
    public void fly() {
        System.out.println(Pheonix.class.getName() + " is Flying");
    }

    @Override
    public void eat() {
        System.out.println(Pheonix.class.getName() + " is Eating");
    }

    @Override
    public void speak() {
        System.out.println(Pheonix.class.getName() + " is Speaking");
    }
}
