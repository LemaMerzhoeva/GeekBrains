package observer;

public class Programmer  implements Observer{

    private final String name;
    private int salary = 200000;
    private VacancyType type = VacancyType.experienced;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public boolean vacancyTypeCorrect(VacancyType type) {
        return type.equals(this.type);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
       if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Программист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d); тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Программист %s: Я найду работу получше! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
        }
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
