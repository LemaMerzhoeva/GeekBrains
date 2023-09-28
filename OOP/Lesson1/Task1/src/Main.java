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

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 1,15);
        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 120, 2,20);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 110, 1,10);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 150, 2,15);
        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 102, 5);
        Product bottleOfWater2 = new BottleOfWater("ООО Источник", "Бутылка с водой (6)", 115, 2);
        Product bottleOfWater3 = new BottleOfWater("ООО Источник", "Бутылка с водой (7)", 160, 3);
        Product bottleOfWater4 = new BottleOfWater("ООО Источник", "Бутылка с водой (9)", 210, 2);

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfWater2);
        arrayList.add(bottleOfWater3);
        arrayList.add(bottleOfWater4);
        VendingMachine vendingMachine = new VendingMachine(arrayList);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (2)", 3);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else{
            System.out.println("Такой бутылки с молоком нет в автомате");
        }

    }
}