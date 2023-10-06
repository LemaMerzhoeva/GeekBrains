/*
* Работник (базовый класс)
* */
public abstract class Employee implements Comparable<Employee> {
    /*
     * Имя
     * */
    protected String name;

    /*
     * Фамилия
     * */
    protected String surName;

    /*
    * Ставка заработной платы
    * */
    protected double salary;

    /*
    * Возраст
    * */
    protected int age;

    /*
    * Расчет среднемесячной заработной платы сотрудников
    * */
    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
