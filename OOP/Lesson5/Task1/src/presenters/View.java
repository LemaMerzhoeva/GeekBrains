package presenters;

import models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showDeleteReservationTableResult(int reservationId);

    /*
    * Отображение списка столиков в приложении
    * */
    void showTables(Collection<Table> tables);

    /*
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * */
    public void reservationTable(Date orderDate, int tableNo, String name);

    /*
    * Установить наблюдателя для представления
    * */
    void setObserver(ViewObserver observer);

    /*
    * Отобразить результат бронирования
    * */
    void showReservationTableResult(int reservationId);


    /* TODO: Реализовать в рамках домашней работы
    * Действие клиента (пользователь нажал на кнопку отмены бронирования)
    * Отменить резерв столика, забронировать на другое время
    * */
    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
