public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("WOOF!");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean bool) {
        if(bool)
            System.out.println("Logrer");
        else
            System.out.println("Knurrer");
    }
}
