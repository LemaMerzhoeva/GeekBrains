package adapter;

import java.time.LocalDateTime;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor){
        System.out.format("Saving data from sensor [%d] at %s\n\ttemperature - %f ; humidity - %f ; pressure - %f \n\r",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }

//    boolean save(SensorTemperature meteoSensor){
//        System.out.format("Saving data from sensor [%d] at %s\n\ttemperature - %f ; humidity - 0 ; pressure - 0 \n\r",
//                meteoSensor.getIdentifier(),
//                LocalDateTime.now(),
//                meteoSensor.temperature());
//        return true;
//    }

}
