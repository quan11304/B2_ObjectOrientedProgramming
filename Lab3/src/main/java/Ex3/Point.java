public class Point extends Shape {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return "Point";
    }
}
