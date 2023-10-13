package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;
    private final int no;

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }

    private Collection<Reservation> reservations = new ArrayList<>();

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public static int getCounter() {
        return counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
}
