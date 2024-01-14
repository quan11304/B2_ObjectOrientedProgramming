public class Circle extends Point {
    // x & y inherited
    private double r;

    public double calArea() {
        return Math.PI * r;
    }

    // calVolume() inherited

    public String getName() {
        return "Circle";
    }
}
