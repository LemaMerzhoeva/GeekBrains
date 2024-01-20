package observer;

public class Master implements Observer{

    private final String name;
    private int salary = 80000;
    private VacancyType type = VacancyType.professional;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public boolean vacancyTypeCorrect(VacancyType type) {
        return type.equals(this.type);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
        }
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
