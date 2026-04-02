package homework6;

public class Main {
    public static void main(String[] args) {

        Figures[] figuresArray = new Figures[5];

        figuresArray[0] = new Triangle(3, 4, 5);
        figuresArray[1] = new Triangle(1, 12, 13);
        figuresArray[2] = new Triangle(6, 8, 10);
        figuresArray[3] = new Rectangle(4, 7);
        figuresArray[4] = new Circle(5);

        double totalPerimeter = 0; // переменная для суммы периметров

        for (Figures fig : figuresArray) {
            totalPerimeter += fig.getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}