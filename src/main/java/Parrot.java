public class Parrot implements Birds,Flyable,Eatable {

    @Override
    public void speak() {
        System.out.println("Parrot is Speaking");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
