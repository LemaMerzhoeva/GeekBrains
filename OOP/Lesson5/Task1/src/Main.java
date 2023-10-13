import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import presenters.View;
import views.BookingView;

import java.util.Date;

/*
* Архитектурный шаблон MVP
* Сервис по резервированию столиков в ресторане
* */
public class Main {
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        /*
        * TODO: Домашнаяя работа
        *  метод changeReservationTable должен заработать
        * */
        bookingView.changeReservationTable(1001, new Date(), 2, "Станислав");
    }
}