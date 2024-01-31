public class Automobile {
    private double fuel;
    private double speed;
    private String license;

    public Automobile(double fuel, double speed, String license) {
        this.fuel = fuel;
        this.speed = speed;
        this.license = license;
    }

    public void accelerate(double v) {
        if (this.fuel > 0)
            this.speed += v;
    }

    public void decelerate(double v) {
        if (this.fuel <= 0)
            this.speed -= v;
    }
}
