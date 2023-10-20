public class Telephone {
    private String number;
    public String getNumber() {
        return number;
    }

    public Telephone(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
