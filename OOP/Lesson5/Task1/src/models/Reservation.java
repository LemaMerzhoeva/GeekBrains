package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Reservation {
    private static int counter = 1000;
    private final int id;
    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    private final Collection<Reservation> reservations = new ArrayList<>();



    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

}
