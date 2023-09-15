import java.util.ArrayList;
import java.util.Scanner;

class BooksStore{
    public static ArrayList<Book> Books = new ArrayList<Book>();
    public static Scanner sc = new Scanner(System.in);

    BooksStore(){
        System.out.println("Добро пожаловать в книжную лавку!");
        ArrayList<Book> books = new ArrayList<Book>();
        Books = books;
    }

    public void Menu(){
        System.out.println("Выберите номер действия");
        System.out.println("1.\tДобавить книгу");
        System.out.println("2.\tУдалить книгу");
        System.out.println("3.\tНайти книгу");
        System.out.println("4.\tВывести список всех книг");
        int numb = 0;
        if(sc.hasNextLine()){
            numb = sc.nextInt();
        }
        switch (numb) {
            case 1:
                AddBook();
                Menu();
                break;
            case 2:
                RemoveBook();
                Menu();
                break;
            case 3:
                FindBook();
                Menu();
                break;
            case 4:
                PrintAllBooks();
                Menu();
                break;
            default:
                break;
        }

    }

    public void AddBook(){
        System.out.println("Введите название книги: ");
        String title = "";
        int cost = 0;
        if(sc.hasNextLine()){
            sc.nextLine();
            title = sc.nextLine();
        }
        System.out.println("Введите стоимость книги: ");
        if(sc.hasNextLine()){
            cost = sc.nextInt();
        }
        AddBook(title, cost);
        
    }

    private void AddBook(String title, Integer cost){
        if (FindBook(title)) {
            System.out.println("Книга с таким названием уже существует");
            return;
        }
        Book book = new Book(title, cost);
        Books.add(book);
        System.out.println("Книга успешно добавлена");
    }

    public Book RemoveBook(){
        PrintAllBooks();
        System.out.println("Каким образом вы хотели бы удалить книгу?");
        System.out.println("1.\tПо номеру в списке");
        System.out.println("2.\tПо названию");
        System.out.println("3.\tВернуться в основное меню");
        int numb = sc.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Выберите номер книги из списка");
                PrintAllBooks();
                int book_numb = 0;
                if(sc.hasNextLine()){
                    book_numb = sc.nextInt() - 1;
                }
                return RemoveBook(book_numb);
            case 2:
                System.out.println("Введите название книги");
                String title = "";
                if(sc.hasNextLine()){
                    sc.nextLine();
                    title = sc.nextLine();
                }
                return RemoveBook(title);
            case 3:
                Menu();
                return null;
            default:
                Menu();
                return null;
        }
    }

    private Book RemoveBook(String title){
        for (Book book : Books) {
            if (title.equals(book.Title)){
                Books.remove(book);
                System.out.println("Книга с названием " + book.Title + " удалена");
                return book;
            }
        }
        return null;
    }

    private Book RemoveBook(int index){
        if (index < Books.size()){
            Book book = Books.get(index);
            Books.remove(index);
            return book;
        }
        else return null;
    }

    public Book RemoveBook(Book book){
        for (Book item : Books) {
            if (book.equals(item)){
                Books.remove(item);
                return item;
            }
        }
        return null;
    }

    public Boolean FindBook(){
        System.out.print("Введите название книги: ");
        String title = "";
        if (sc.hasNextLine()){
            sc.nextLine();
            title = sc.nextLine();
        }
        return FindBook(title);
    }

    private Boolean FindBook(String title){
        for (Book book : Books) {
            if (book.Title.equals(title)){
                System.out.println("Книга с названием "+ title + " найдена");
                return true;
            }
        }
        System.out.println("Книга с названием "+ title + " не найдена");
        return false;
    }

    public void PrintAllBooks(){
        if (Books.size() == 0){
            System.out.println("Список книг пуст");
            return;
        }
        int i = 1;
        for (Book book : Books) {
            System.out.println(i++ + ".\tTitle: " + book.Title + "  Cost: " + book.Cost);
        }
    }

}

class Book{
    String Title;
    Integer Cost;

    Book(String title, Integer cost){
        Title = title;
        Cost = cost;
    }
    
    public Boolean equals(Book book){
        if (Title.equals(book.Title) && Cost.equals(book.Cost)){
            return true;
        }
        else {
            return false;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        BooksStore booksStore = new BooksStore();
        booksStore.Menu();

    }
}

// добавить книгу, удалить книгу, поиск книги, цена книги