package observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private final String name;
    private int maxSalary;
    private VacancyType type;

    private Publisher jobAgency;

    public Company(String name, Publisher jobAgency, int maxSalary, VacancyType type) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.type = type;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(new Vacancy(name, salary, type));
    }

}
