public class Crow implements Birds {

    @Override
    public void fly() {
        System.out.println("Crow Flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow Eating");
    }

    @Override
    public void speak() {
        System.out.println("Crow Speaking");
    }
}
