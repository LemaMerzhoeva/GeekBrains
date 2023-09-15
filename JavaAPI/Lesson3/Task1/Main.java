//import java.awt.PageAttributes.PrintQualityType;
import java.util.ArrayList;

class People{
    String Name;
    Integer Age;

    People(String name, Integer age){
        Name = name;
        Age = age;
    }
}

class Main{
    public static void main(String[] args){
        People p1 = new People("Vlad", 30);
        People p2 = new People("Ivan", 23);
        ArrayList<People> people = new ArrayList<People>();
        people.add(p1);
        people.add(p2);
        for (People item : people) {
            System.out.println("Имя: " + item.Name + " Возраст: " + item.Age);
        }
    }
}