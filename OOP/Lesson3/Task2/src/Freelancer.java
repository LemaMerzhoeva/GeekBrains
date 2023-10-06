/*
 * Реализовать тип фрилансер в качестве дз
 * Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
 * Формула расчета среднемесячной заработной платы может быть такова:
 * «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
 * */
public class Freelancer  extends Employee{
    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString(){
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата сотрудника (фиксированная): %.2f (руб.); Возраст: %d",
                surName, name, calculateSalary(), age);
    }
}
