import java.util.Arrays;
import java.util.Random;
public class Main {

    private static Random random = new Random();

    static Employee generateEmployee(String employeeType) {
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин"};
        int min, max, salary;
        int minAge = 18;
        int maxAge = 60;
        int age = random.nextInt(maxAge - minAge) + minAge;
        switch (employeeType){
            case "Worker":
                min = 50000;
                max = 120000;
                salary = random.nextInt(max - min) + min;
                return new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
            case "Freelancer":
                min = 200;
                max = 5000;
                salary = random.nextInt(max - min) + min;
                return new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        }
        return null;
    }

    static Employee[] generateEmployees(int count){
        String[] employeeTypes = new String[] {"Worker", "Freelancer"};
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++){
            array[i] = generateEmployee(employeeTypes[random.nextInt(employeeTypes.length)]);
        }
        return array;
    }


//    static Worker generateWorker(){
//        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Панкратий", "Рубен", "Герман"};
//        String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин"};
//        int min = 50000;
//        int max = 120000;
//        int salary = random.nextInt(max - min) + min;
//        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary);
//        return worker;
//    }

//    /*
//    * TO DO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во сотрудников
//    * различных типов
//    * */
//    static Worker[] generateWorkers(int count){
//        Worker[] array = new Worker[count];
//        for (int i = 0; i < array.length; i++){
//            array[i] = generateWorker();
//        }
//        return array;
//    }


    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        System.out.println("Сортировка по зарплате (восходящая)");

        Arrays.sort(employees, new SalaryComparator(SortType.Ascennding));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сортировка по зарплате (нисходящая)");

        Arrays.sort(employees, new SalaryComparator(SortType.Discending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сортировка по возрасту (восходящая)");

        Arrays.sort(employees, new AgeComparator(SortType.Ascennding));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сортировка по возрасту (нисходящая)");

        Arrays.sort(employees, new AgeComparator(SortType.Discending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}