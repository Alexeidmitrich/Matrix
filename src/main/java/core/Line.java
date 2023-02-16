package core;

public class Line {

   Point start;
   Point end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }
}
