package sample1;

import sample1.Animal;
import sample1.Cat;
import sample1.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик");
        cat1.setColor("Рыжий");

        Dog dog1 = new Dog();

        Animal cat2 = new Cat("Тиграша");
        ((Cat) cat2).setColor("Серый");

        Object dog2 = new Dog();

        Animal[] animals = new Animal[]{cat1, cat2, dog1, (Animal) dog2};
        processVoice(animals);



    }

    public static void processVoice(Animal[] animals){
        for (Animal animal: animals){
            animal.voice();
            if (animal instanceof Cat){
                System.out.println(((Cat) animal).getColor() );
            }
        }
    }

}