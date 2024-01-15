public class Circle extends Point {
    // x & y inherited
    protected double r;

    public double calArea() {
        return Math.PI * this.r;
    }

    // calVolume() inherited

    public String getName() {
        return "Circle";
    }
}
