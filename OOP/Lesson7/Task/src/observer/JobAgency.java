package observer;


import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer: observers){
            if (observer.vacancyTypeCorrect(vacancy.getType()))
                observer.receiveOffer(vacancy);
            else System.out.printf("Данная вакансия [%s] не подходит соискателю [%s] по типу\n", vacancy, observer);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
