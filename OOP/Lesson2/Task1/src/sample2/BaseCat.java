package sample2;

public abstract class BaseCat implements Animal{
    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Котик мяукает.");
    }
}
