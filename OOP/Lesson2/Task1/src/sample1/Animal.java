package sample1;

public abstract class Animal {
    //состояние
    private String name;

    //поведение
    public abstract void voice();

    //поведение
    public void jump(){
        System.out.println("Животное подпрыгнуло");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }

}
