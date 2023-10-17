package srp1;

public class SquareDrawer {

    private final SquareV2 square;
    private int scale = 1;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public SquareDrawer(SquareV2 square, int scale) {
        this.square = square;
        this.scale = scale;
    }

    public SquareDrawer(SquareV2 square) {
        this.square = square;
    }

    public void draw(){
        for (int i = 0; i < square.getSide() * scale; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < square.getSide() * scale - 2; i++){
            System.out.print("*");
            for (int j = 1; j < square.getSide() * scale * 2 - 2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < square.getSide() * scale; i++){
            System.out.print("* ");
        }
        System.out.println();
    }

}
