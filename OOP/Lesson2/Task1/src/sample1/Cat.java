package sample1;

public class Cat extends Animal {

    private String color;

    public Cat(String name) {
        super(name);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает");
    }

    @Override
    public void jump() {
        System.out.println("Котик подпрыгнул");
    }
}
