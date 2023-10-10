package globalPackage.bank;
/*
* Физическое лицо
* */
public class Person implements PersonalData{
    private final String fio;
    private final String inn;

    public Person(String name, String inn) {
        this.fio = name;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return inn;
    }
    @Override
    public String toString(){
        return String.format("ИНН: %s; ФИО: %s", inn, fio);
    }
}
