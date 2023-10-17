package srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderV2 {
    private Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    private double price;

    private void inputFromConsole(){
        clientName = prompt("Имя клиента: ");
        product = prompt("Продукт: ");
        qnt = Integer.parseInt(prompt("Количество: "));
        price = Double.parseDouble(prompt("Цена: "));

    }

    private String prompt(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    public OrderV2() {
        inputFromConsole();
    }

    public OrderV2(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
}
