public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.eat("Dogfood");
        cat.eat("Fish");

        dog.showMood(true);
        dog.showMood(false);
        cat.showMood(false);
    }
}
