package views;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void showReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else{
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showDeleteReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Старая бронь удалена. Номер удаленной брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не удалось найти старую бронь. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    /*
    * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
    * */
    @Override
    public void reservationTable(Date orderDate, int tableNo, String name){
        /*
         * Шаблон наблюдатель
         * */
        observer.onReservationTable(orderDate, tableNo, name);
    }


    /* TODO: Реализовать в рамках домашней работы
    * Действие клиента (пользователь нажал на кнопку отмены бронирования)
    * Отменить резерв столика, забронировать на другое время
    * */
    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){

        observer.changeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
