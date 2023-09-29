import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();

        Cat[] cats = {
                new Cat("Котик", 11),
                new Cat("Морзик", 26),
                new Cat("Черныш", 21),
                new Cat("Барсик", 5),
                new Cat("Лютик", 10),
                new Cat("Ластик", 2),
                new Cat("Овсянка", 15),
                new Cat("Мотя", 30),
                new Cat("Вася", 20),
                new Cat("Пушинка", 7)
        };

        Plate plate = new Plate(50);


        System.out.println("[Открываем столовую для котиков]\n______________________________________");
        for (Cat cat: cats){
            plate.info();
            cat.eat(plate);
            plate.addFood(rd.nextInt(10));
        }

        System.out.println("\n[Итоги трапезы]\n______________________________________");
        for (Cat cat: cats){
            cat.info();
        }
    }
}