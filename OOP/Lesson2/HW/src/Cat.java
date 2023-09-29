public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite){
            plate.setFood(plate.getFood() - appetite);
            System.out.printf("%s поел из тарелки\n", name);
            full = true;
        }
        else {
            System.out.printf("Еды в тарелке не хватает... %s голодный\n", name);
        }
    }

    public void info() {
        if (full){
            System.out.printf("%s наелся)\n", name);
        }
        else {
            System.out.printf("%s все еще хочет кушать ... (\n", name);
        }
    }
}