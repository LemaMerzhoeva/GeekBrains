package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;


    /*
    * Получение списка всех столиков
    * */
    @Override
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }


    /*
    * Бронирование столика
    * */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорреткный номер столика.");
    }


    @Override
    public int deleteReservationTable(int oldReservationId){
        for (Table table: loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservationId) {
                    Collection<Reservation> reservations = table.getReservations();
                    reservations.remove(reservation);
                    table.setReservations(reservations);
                    return reservation.getId();
                }
            }
        }
        throw new RuntimeException("Некорреткный номер старой брони.");
    }

}
