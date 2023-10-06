public class Dog extends Animal{

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

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

}
