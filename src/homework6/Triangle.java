package homework6;

public class Triangle implements Figures {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2; // математика
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // какая-то высшая математика
    }
}