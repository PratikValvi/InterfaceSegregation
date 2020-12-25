public class Penguin implements Birds {

    @Override
    public void fly() {

    }

    @Override
    public void eat() {
        System.out.println(Penguin.class.getName() + " is eat");
    }

    @Override
    public void speak() {
        System.out.println(Penguin.class.getName() + " is speaking");
    }
}
