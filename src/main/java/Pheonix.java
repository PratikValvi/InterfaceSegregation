public class Pheonix implements Birds,Eatable,Flyable {

    @Override
    public void speak() {
        System.out.println(Pheonix.class.getName() + " is speaking");
    }

    @Override
    public void eat() {
        System.out.println(Pheonix.class.getName() + " is eating");
    }

    @Override
    public void fly() {
        System.out.println(Pheonix.class.getName() + " is flying");
    }
}
