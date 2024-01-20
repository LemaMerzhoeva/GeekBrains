package builder;
// порождающий шаблон проектирования - строитель, динамическая строка
public class Program {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("AAAA");
        // реализация текущего интерфейса
        stringBuilder1
                .append("BBB")
                .append("CCC")
                .append("EEE")
                .delete(1, 3)
                .append("DDD")
                .toString();

        Order order = new OrderBuilder()
                .setProductId(45001)
                .setQnt(2)
                .setPrice(3000)
                .setProductName("Product #1")
                .build();
    }
}
