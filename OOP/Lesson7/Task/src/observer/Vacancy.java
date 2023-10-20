package observer;

public class Vacancy {
    private String nameCompany;
    private int salary;
    private VacancyType type;

    public String getNameCompany() {
        return nameCompany;
    }

    public int getSalary() {
        return salary;
    }

    public VacancyType getType() {
        return type;
    }

    public Vacancy(String nameCompany, int salary, VacancyType type) {
        this.nameCompany = nameCompany;
        this.salary = salary;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "nameCompany='" + nameCompany + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
