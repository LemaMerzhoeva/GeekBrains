import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        People people1 = new People("Alice", "Stink");
        People people2 = new People("Mark", "Smith");
        People people3 = new People("Osk", "Todd");
        People people4 = new People("Karl", "Todd");

        //пробуем добавить новых людей
        phoneBook.addNote(people2, new Telephone("+70002345687"));
        phoneBook.addNote(people4, new Telephone("+71112345687"));
        phoneBook.addNote(people4, new Telephone("81112345687"));
        phoneBook.addNote(people3, new Telephone("+70222000445"));

        phoneBook.addNote(people3, new Telephone("+70222000449"));
        phoneBook.addNote(people3, new Telephone("+70222000450"));


        phoneBook.addNote(people1, new Telephone("+70001112233"));
        //пробуем добавить к существующему человеку новый номер
        phoneBook.addNote(people1, new Telephone("+70001112246"));
        //пробуем добавить к существующему человеку существующий номер
        phoneBook.addNote(people1, new Telephone("+70001112233"));



        System.out.println();
        phoneBook.display();


    }
}