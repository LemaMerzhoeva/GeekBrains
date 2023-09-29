package sample2;

public abstract class BaseDog  implements Animal{
    @Override
    public void jump() {
        System.out.println("Собака прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}
