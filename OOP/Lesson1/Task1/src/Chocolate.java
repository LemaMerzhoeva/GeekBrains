public class Chocolate extends Product{
    String topping;
    int weight;
    int calories;

    public String getTopping() { return topping;}

    public void setTopping(String topping) { CheckTopping(topping);}

    public int getWeight() { return weight;}

    public void setWeight(int weight) { CheckWeight(weight);}

    public int getCalories() { return calories;}

    public void setCalories(int calories) { CheckCalories(calories);}

    public Chocolate(String brand, String name, double price, String topping, int weight, int calories){
        super(brand, name, price);
        CheckTopping(topping);
        CheckWeight(weight);
        CheckCalories(calories);
    }

    private void CheckWeight(int weight){
        if (weight < 50){
            if (this.weight >= 50){
                return;
            }
            else {
                this.weight = 50;
            }
        }
        else {
            this.weight = weight;
        }
    }

    private void CheckTopping(String topping){
        if (topping.equals("<Tasteless>")){
            if (!this.topping.equals("<Tasteless>")){
                return;
            }
            else {
                this.topping = "<Tasteless>";
            }
        }
        else {
            this.topping = topping;
        }
    }

    private void CheckCalories(int calories){
        if (calories < 100){
            if (this.calories >= 100){
                return;
            }
            else {
                this.calories = 100;
            }
        }
        else {
            this.calories = calories;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - Вес: %d - Начинка: %s - Ккал: %d",
                brand, name, price, weight, topping, calories);
    }
}
