package app;

public class ShapeMain {
    public static void main(String[] args) {
        Line line = new Line();
        Circle circle = new Circle();

        line.draw();
        line.redraw();
        System.out.println(line.getArea());

        circle.draw();
        circle.redraw();
        System.out.println(circle.getArea());
    }
}
