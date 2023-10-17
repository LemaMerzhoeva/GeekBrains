package srp1;

public class Program {
    public static void main(String[] args) {
        Square square1 = new Square(new Point(1,1), 5);
        System.out.println("Площадь фигуры: " + square1.getArea());
        square1.draw();

        SquareV2 square2 = new SquareV2(new Point(1,1),5);
        System.out.println("Площадь фигуры: " + square2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(square2, 2);
        squareDrawer.draw();
        squareDrawer.setScale(3);
        squareDrawer.draw();
    }
}
