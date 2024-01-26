public class Circle extends Point {
    // x & y inherited
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double calArea() {
        return Math.PI * this.r;
    }


    public String getName() {
        return "Circle";
    }
}
