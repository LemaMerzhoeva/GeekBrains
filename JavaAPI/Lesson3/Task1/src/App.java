import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Lema");
        people.add("Kate");
        people.add(1, "Alice");
        people.set(2, "Lion");
        System.out.println(people.get(1));

    }
}
