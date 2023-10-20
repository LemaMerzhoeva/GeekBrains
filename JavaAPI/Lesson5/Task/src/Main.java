import java.util.*;

class Book{
    String name;
    String a;
    Integer size;
    Book(String name, String a, Integer size){
        this.name = name;
        this.a = a;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", size=" + size +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        Map<String, String> states = new HashMap<String, String>();
//        states.put("Russia", "Moscow");
//        states.put("Germany", "Berlin");
//        states.put("Kazakhstan", "Astana");
//        System.out.println(states.get("Russia"));
//        Set<String> keys = states.keySet();
//        System.out.println(keys);
//        Collection<String> values = states.keySet();
//        System.out.println(values);

//        System.out.println();
//        Map<Integer, LinkedList<String>> rack1 = new HashMap<Integer, LinkedList<String>>();
//        LinkedList<String> books1 = new LinkedList<String>();
//        books1.add("A");
//        books1.add("B");
//        books1.add("C");
//        LinkedList<String> books2 = new LinkedList<String>();
//        books2.add("D");
//        books2.add("E");
//        books2.add("F");
//
//        rack1.put(1, books1);
//        rack1.put(2, books2);
//        System.out.println(rack1);
//        System.out.println(rack1.get(2).get(2));


        System.out.println();
        Map<Integer, LinkedList<Book>> rack2 = new HashMap<Integer, LinkedList<Book>>();
        LinkedList<Book> books1 = new LinkedList<Book>();
        books1.add(new Book("A", "E", 15));
        books1.add(new Book("B", "F", 20));
        books1.add(new Book("C", "G", 30));
        books1.add(new Book("D", "H", 40));
        LinkedList<Book> books2 = new LinkedList<Book>();
        books2.add(new Book("A2", "E2", 15));
        books2.add(new Book("B2", "F2", 20));
        books2.add(new Book("C2", "G2", 30));
        books2.add(new Book("D2", "H2", 40));
        rack2.put(1, books1);
        rack2.put(2, books2);
//        System.out.println(rack2);
//        System.out.println(rack2.get(2).get(2).name);

        System.out.println();
        for (Map.Entry<Integer, LinkedList<Book>> item: rack2.entrySet()){
            System.out.printf("Shelf: %s\n", item.getKey());
            for (Book i: item.getValue()){
                System.out.printf("\tBook's name: %s\n", i.name);
            }
        }



    }
}