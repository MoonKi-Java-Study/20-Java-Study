package app;

import lib.Point;
import lib.Shape;

import java.awt.image.CropImageFilter;
import java.util.Scanner;

public class Circle implements Shape {
    Point a = new Point();
    double radius;

    public Circle() {
        radius = 0;
    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        double r = 0;

        System.out.print("원의 중심 좌표값: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.print("원의 반지름: ");
        this.radius = scanner.nextDouble();
        a.setX(x);
        a.setY(y);

        System.out.println("객체의 중심 좌표값: (" +
                 a.getX() + "," + a.getY() + ")");
        System.out.println("객체의 반지름: " + radius);
    }

    public double getArea() {
        return (PI * Math.pow(radius, 2));
    }
}
