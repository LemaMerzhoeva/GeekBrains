public class Cat extends Animal{

    private static int counter;

    public static int getCounter(){
        return counter;
    }

    static {
        counter = 0;
    }

    {
        counter++;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать!");
    }
}
