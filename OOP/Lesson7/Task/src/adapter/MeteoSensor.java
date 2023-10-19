package adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId();
    LocalDateTime getDateTime();
    double getTemperature();
    double getHumidity();
    double getPressure();

}
