package ocp1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<ShapeV2> shapes = new ArrayList<>();
        shapes.add(new RightTriangleV2(2, 3));
        shapes.add(new SquareV2(4));
        shapes.add(new CircleV2(10));
        double sumArea = 0;
        for (ShapeV2 shape: shapes) {
            sumArea += shape.getArea();
        }
        System.out.printf("Сумма площадей фигур: %.2f\n", sumArea);
    }
}
