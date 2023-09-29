package sample3;

public class Wall extends Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    int getHeight() {
        return height;
    }

    @Override
    int getLength() {
        return 0;
    }
}
