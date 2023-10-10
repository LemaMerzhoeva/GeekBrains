import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> fruits;
    private int counter;
    private float weigth;
    private float fruit_weigth;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        this.counter = fruits.size();
        if (counter > 0) {
            this.fruit_weigth = fruits.get(0).getWeight();
        }
        this.weigth = counter * fruit_weigth;
    }

    public float getWeigth(){
        float res = counter * fruit_weigth;
        System.out.printf("Вес данной коробки: %.1f у.е.\n", res);
        return res;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter == 0) {
            this.fruit_weigth = 0;
            this.fruits = new ArrayList<>(0);
        }
        this.counter = counter;
        this.weigth = counter * fruit_weigth;
    }

    public boolean Compare(Box box){
        return weigth == box.weigth;
    }

    @Override
    public String toString() {
        if (fruits.size() > 0)
            return "[Вид фруктов: " + fruits.get(0).getClass().getName() +
                    " Количество фруктов: " + counter +
                    " Вес коробки: " + weigth + "]";
        else return "[Пустая коробка]";
    }

    public void addFruit(T fruit){
        if (!this.fruits.isEmpty()){
            if (fruit.getClass().equals(fruits.get(0).getClass())){
                this.fruits.add(fruit);
                this.setCounter(++counter);
            }
            else {
                System.out.println("Не удалось добавить фрукт в коробку, так как в коробке присутствуют фрукты другого вида");
                return;
            }
        }
        else{
            this.fruit_weigth = fruit.getWeight();
            this.fruits.add(fruit);
            this.setCounter(++counter);
        }
        System.out.println("Фрукт добавлен в коробку!");
    }

    public T deleteFruit(){
        counter--;
        weigth -= fruit_weigth;
        return fruits.remove(fruits.size() - 1);
    }
}
