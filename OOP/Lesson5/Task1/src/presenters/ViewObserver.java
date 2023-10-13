package presenters;


import java.util.Date;

/*
* Наблюдатель за представлением
* */
public interface ViewObserver {

     void onReservationTable(Date orderDate, int tableNo, String name);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
