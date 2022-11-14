public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("MEOW!");
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
    @Override
    public void showMood(boolean bool) {
        if(bool)
            System.out.println("Spinder");
        else
            System.out.println("Hvæser");
    }
}
