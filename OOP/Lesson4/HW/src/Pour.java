public class Pour<T extends Box>{
    private final T from;
    private final T to;
    private final int fruits_quantity;

    public Pour(T from, T to, int fruits_quantity) {
        this.from = from;
        this.to = to;
        this.fruits_quantity = fruits_quantity;
    }

    public void execute(){
        if (from.fruits.get(0).getClass().equals(to.fruits.get(0).getClass()) || to.fruits.isEmpty()){
            if (fruits_quantity <= from.getCounter()){
                System.out.printf("Пересыпали %d фруктов из коробки с данным содержимым: %s\nВ коробку с данным содержимым: %s\n", fruits_quantity, from, to);
                for (int i = 0; i < fruits_quantity; i++){
                    to.addFruit(from.deleteFruit());
                }
                System.out.println("Итоговое состояние коробок");
                System.out.println(from);
                System.out.println(to);
            }
            else {
                System.out.println("Невозможно переложить такое количество фруктов, в коробке недостаточное количество.");
            }
        }
        else {
            System.out.println("Невозможно переложить фрукты, так как в коробке присутствует другой вид фруктов.");
        }
    }

}
