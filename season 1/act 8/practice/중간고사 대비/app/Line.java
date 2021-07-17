package app;

import lib.Point;
import lib.Shape;

import java.util.Scanner;

public class Line implements Shape {
    Point a = new Point();
    Point b = new Point();

    public Line() {

    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Line 객체 생성, 2점 좌표값 입력해주세요");

        System.out.print("(x1, y1):");
        x = scanner.nextInt();
        y = scanner.nextInt();
        a.setX(x);
        a.setY(y);

        System.out.print("(x2, y2):");
        x = scanner.nextInt();
        y = scanner.nextInt();
        b.setX(x);
        b.setY(y);
    }

    @Override
    public double getArea() {
        System.out.println("Line: (" +
                this.a.getX() + "," +
                this.a.getY() + ")\t\t" +
                this.b.getX() + "," +
                this.b.getY() + ")");

        double distanceAB = Math.sqrt(
                (Math.pow((this.a.getX() - this.b.getX()), 2) +
                        (Math.pow((this.a.getY() - this.b.getY()), 2))));

        return distanceAB;
    }
}
