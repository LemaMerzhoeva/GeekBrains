import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, String topping){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && chocolate.getTopping().equals(topping))
                    return chocolate;
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int calories){
        for (Product product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories)
                    return chocolate;
            }
        }
        return null;
    }

    public void displayInfo(){
        for (Product product: products) {
            System.out.println(product.displayInfo());
        }
    }
}
