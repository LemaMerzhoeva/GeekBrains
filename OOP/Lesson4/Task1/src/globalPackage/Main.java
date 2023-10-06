package globalPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Employee("aaaaa", 30));
        arrayList.add(true);
        arrayList.add(12);
        arrayList.add("Hello!");

        for (Object o: arrayList) {
            if (o instanceof Employee) {
                Employee e = (Employee) o;
                System.out.printf("%s - %d\n", e.getName(), e.getAge());
            }
        }


        MyArrayList<Employee> arrayList1 = new MyArrayList(new Employee[10]);
        arrayList1.add(new Employee("aaaaa", 30));
        arrayList1.add(new Employee("bbbbb", 18));
        arrayList1.add(new Employee("ccccc", 25));
        System.out.println("Кол-во элементов: " + arrayList1.size());

        for (Employee o: arrayList1) {
            if (o != null) {
                System.out.printf("%s - %d\n", o.getName(), o.getAge());
            }
        }

    }
}