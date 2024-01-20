package observer;

public class Student implements Observer{

    private final String name;
    private int salary = 2000;
    private VacancyType type = VacancyType.beginner;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public boolean vacancyTypeCorrect(VacancyType type) {
        return type.equals(this.type);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary(), vacancy.getType());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", type=" + type +
                '}';
    }
}
