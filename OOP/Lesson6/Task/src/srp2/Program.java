package srp2;

public class Program {

    /*
    * TODO: Переработать структуру приложения Order,
    *  приложение должно соответствовать принципу SRP
    * */
    public static void main(String[] args) {
        OrderV2 order = new OrderV2();
        OrderSaver orderSaver = new OrderSaver(order, "json");
        orderSaver.save();
    }
}
