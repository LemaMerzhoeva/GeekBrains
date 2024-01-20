package adapter;

// структурный патерн - адаптер
public class Program {

    public static void main(String[] args) {
        MS200 ms200 = new MS200();
        MeteoStore meteoStore = new MeteoStore();
        meteoStore.save(ms200);

        ST500 st500 = new ST500();
        meteoStore.save(new AdapterST500(st500));
    }

}
