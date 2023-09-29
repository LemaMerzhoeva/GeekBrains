package sample2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Animal cat2 = new Cat();
        BaseCat cat3 = new Cat();
        Animal[] animals = new Animal[]{cat1, dog1, cat2, cat3};
        processVoice(animals);
    }

    public static void processVoice(Animal[] animals) {
        for (Animal animal: animals){
            animal.jump();
        }
    }
}
