package ocp1;

public class CircleV2 implements ShapeV2{

    private final int radius;

    public int getRadius() {
        return radius;
    }

    public CircleV2(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * Math.pow(radius, 2);
    }
}
