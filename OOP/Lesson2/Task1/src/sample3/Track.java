package sample3;

public class Track extends Obstacle{

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    int getHeight() {
        return 0;
    }

    @Override
    int getLength() {
        return length;
    }
}
