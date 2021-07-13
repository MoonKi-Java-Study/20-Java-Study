class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        Point p = (Point) obj;
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(2, 3);
        Point point3 = new Point(3, 4);

        if (point1 == point2) {//false
            System.out.println("1 == 2");
        }
        if (point1.equals(point2)) {//true
            System.out.println("1 is equal to 2");
        }
        if (point1.equals(point3)) {//false
            System.out.println("1 is equal to c");
        }
    }
}
