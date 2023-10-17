package lsp;

public class Bird {
    private int flySpeed = 10;
    private boolean canFly;
    public boolean isCanFly(){
        return canFly;
    }
    public Bird(){
        canFly = true;
    }

    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    public int getFlySpeed(){
        return flySpeed;
    }

    public void fly(){
        System.out.printf("Птица летит со скоростью %d км/ч\n", flySpeed);
    }
}
