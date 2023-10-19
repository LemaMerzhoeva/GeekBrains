package singltone;


// пример синглтона

public class Settings {
    private static Settings instance;
    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();

            // TODO: получим настройки, проинициализируем поля объекта
        }
        return instance;
    }

    private Settings() {

    }

    private String param1;
    private int param2;
    private boolean param3;



}
