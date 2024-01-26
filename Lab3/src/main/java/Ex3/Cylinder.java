public class Cylinder extends Circle {
    // x, y, r inherited
    protected double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double calArea() {
        return Math.PI * this.r * 2 * (this.r + 1);
    }
    // Surface area of the cylinder

    public double calVolume() {
        return Math.PI * Math.pow(this.r, 2) * this.h;
    }

    public String getName() {
        return "Cylinder";
    }
}
