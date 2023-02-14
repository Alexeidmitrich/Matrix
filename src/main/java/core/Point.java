package core;

public class Point extends Entity {

    public Point() {
        super(0, 0, 0);
    }

    public Point(double x, double y, double z) {
        super(x,y,z);
    }

    public double distance(Point p) {
        double d =  Math.sqrt(Math.pow((super.x - p.x), 2) + Math.pow((super.y - p.y), 2) + Math.pow((super.z - p.z), 2));
        return d;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public void moveTo(double x, double y, double z) {
        super.x = x;
        super.y = y;
        super.z = z;
    }

    public void moveTo(Point p) {
        
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 3, 6);
        System.out.println(p1.distance(p2));
        p2.moveTo(4, 5, 3);
        System.out.println(p2);
    }
}
