package presenters;


import models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    /*
    * Отобразить результат бронирования на представлении
    * */
    private void updateUIShowReservationResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    private void updateUIShowDeleteReservationResult(int reservationId){
        view.showDeleteReservationTableResult(reservationId);
    }


    /*
    * Произошло событие, пользователь нажал на кнопку резерва столика
    * */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try{
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1);
        }
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try{
            int reservationNo = model.deleteReservationTable(oldReservation);
            updateUIShowDeleteReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowDeleteReservationResult(-1);
        }

        try{
            int reservationNo = model.reservationTable(reservationDate, tableNo, name);
            updateUIShowReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1);
        }
    }
}
