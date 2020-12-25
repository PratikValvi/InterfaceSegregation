public class Application {
    public static void main(String[] args) {
        Birds crow = new Crow();
        crow.fly();
        crow.eat();
        crow.speak();

        Birds parrot = new Parrot();
        parrot.fly();
        parrot.eat();
        parrot.speak();

        Birds pheonix = new Pheonix();
        pheonix.fly();
        pheonix.eat();
        pheonix.speak();
    }
}
