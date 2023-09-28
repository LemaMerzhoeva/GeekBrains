// Модель автомата по продаже товаров

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "Бутылка с водой", -210);

//        product1.brand = "ООО Источник";
//        product1.name = "Бутылка с водой";
//        product1.price = 210;

//        System.out.println(product1.displayInfo());
//        product1.setName("Бутылка");
//        System.out.println(product1.displayInfo());
//        product1.setPrice(120);
//        System.out.println(product1.displayInfo());
//        product1.setPrice(99);
//        System.out.println(product1.displayInfo());
//        product1.setPrice(540);
//        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        Product product3 = new Product("Бутылка с водой (3)", 50);

        Product bottleOfMilk1 = new BottleOfMilk("ООО Коровка", "Бутылка с молоком (1)", 150, 1,15);
        Product bottleOfMilk2 = new BottleOfMilk("ООО Коровка", "Бутылка с молоком (2)", 120, 2,20);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Коровка", "Бутылка с молоком (3)", 110, 1,10);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Коровка", "Бутылка с молоком (4)", 150, 2,15);
        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 102, 5);
        Product bottleOfWater2 = new BottleOfWater("ООО Источник", "Бутылка с водой (6)", 115, 2);
        Product bottleOfWater3 = new BottleOfWater("ООО Источник", "Бутылка с водой (7)", 160, 3);
        Product bottleOfWater4 = new BottleOfWater("ООО Источник", "Бутылка с водой (9)", 210, 2);
        Product chocolate1 = new Chocolate("ООО Вкуснятина", "Плитка шоколада (1)", 150, "Клубника", 80, 350);
        Product chocolate2 = new Chocolate("ООО Вкуснятина", "Плитка шоколада (2)", 250, "Фундук", 85, 380);
        Product chocolate3 = new Chocolate("ООО Вкуснятина", "Плитка шоколада (3)", 350, "Орео", 90, 400);
        Product chocolate4 = new Chocolate("ООО Вкуснятина", "Плитка шоколада (4)", 200, "Лесной орех", 85, 360);


        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfWater2);
        arrayList.add(bottleOfWater3);
        arrayList.add(bottleOfWater4);
        arrayList.add(chocolate1);
        arrayList.add(chocolate2);
        arrayList.add(chocolate3);
        arrayList.add(chocolate4);
        VendingMachine vendingMachine = new VendingMachine(arrayList);
        vendingMachine.displayInfo();
        System.out.println();


        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (2)", 3);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else{
            System.out.println("Такой бутылки с молоком нет в автомате");
        }

        Chocolate chocolate_strawberry = vendingMachine.getChocolate("Плитка шоколада (2)", "Клубника");
        if (chocolate_strawberry != null){
            System.out.println("Вы купили:");
            System.out.println(chocolate_strawberry.displayInfo());
        }
        else{
            System.out.println("Такой плитки шоколада нет в автомате");
        }

        Chocolate chocolate_calories = vendingMachine.getChocolate("Плитка шоколада (2)", 380);
        if (chocolate_calories != null){
            System.out.println("Вы купили:");
            System.out.println(chocolate_calories.displayInfo());
        }
        else{
            System.out.println("Такой плитки шоколада нет в автомате");
        }


    }
}