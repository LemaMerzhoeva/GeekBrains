package srp2;

import srp1.SquareV2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderSaver {
    private final OrderV2 order;
    private String saveType;

    public OrderSaver(OrderV2 order, String saveType) {
        this.order = order;
        this.saveType = saveType;
    }

    public void save() {
        if (saveType.equals("json")) {
            String fileName = "order.json";
            try (FileWriter writer = new FileWriter(fileName, false)) {
                writer.write("{\n");
                writer.write("\"clientName\": \"" + order.getClientName() + "\",\n");
                writer.write("\"product\": \"" + order.getProduct() + "\",\n");
                writer.write("\"qnt\": " + order.getQnt() + ",\n");
                writer.write("\"price\": " + order.getPrice() + "\n");
                writer.write("}\n");
                writer.flush();
                System.out.println("Информация по заказу успешно сохранена");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
