package homework6;

public class Circle implements Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; //математика
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; //математика
    }
}
