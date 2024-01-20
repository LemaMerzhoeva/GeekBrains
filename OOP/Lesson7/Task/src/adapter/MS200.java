package adapter;

import java.time.LocalDateTime;
import java.util.Random;

public class MS200 implements MeteoSensor{

    private static Random random = new Random();

    private int id;

    {
        id = 1000 + random.nextInt(8999);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    @Override
    public double getTemperature() {
        return 25;
    }

    @Override
    public double getHumidity() {
        return 60;
    }

    @Override
    public double getPressure() {
        return 752.4;
    }
}
