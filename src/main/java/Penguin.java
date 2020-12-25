public class Penguin implements Birds,Eatable {

    @Override
    public void speak() {
        System.out.println(Penguin.class.getSimpleName() + " is speaking");
    }

    @Override
    public void eat() {
        System.out.println(Penguin.class.getSimpleName() + " is eating");
    }
}
