package observer;

// поведенческий шаблон проектирования - наблюдатель (типа один ко многим)
public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000, VacancyType.experienced);
        Company yandex = new Company("Yandex", jobAgency, 40000, VacancyType.beginner);
        Company geekBrains = new Company("GeekBrains", jobAgency, 400000, VacancyType.professional);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            System.out.println();
            yandex.needEmployee();
            System.out.println();
            geekBrains.needEmployee();
            System.out.println("______________________________________________________________________");
        }

    }

}
