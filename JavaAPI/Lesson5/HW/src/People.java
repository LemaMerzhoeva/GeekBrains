public class People {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }


    public People(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\tФамилия: %s", name, surName);
    }
}
