public class Crow implements Birds,Flyable,Eatable {

    @Override
    public void speak() {
        System.out.println("Crow Speaking");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
}
