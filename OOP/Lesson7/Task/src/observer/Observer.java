package observer;

public interface Observer {
    boolean vacancyTypeCorrect(VacancyType type);
    void receiveOffer(Vacancy vacancy);

}
