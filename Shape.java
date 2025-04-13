public class Shape {
    public double areaOfSquare(double side) {
        return side * side;
    }
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }
    public double areaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("P.SAI LIKITH,24306, CSE-A");
        Shape shape = new Shape();
        double square = shape.areaOfSquare(5);
        System.out.println("Area of a square: " + square);
        double rectangle = shape.areaOfRectangle(10, 20);
        System.out.println("Area of a rectangle: " + rectangle);
        double circle = shape.areaOfCircle(12);
        System.out.println("Area of a circle: " + circle);
    }
}

