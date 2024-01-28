public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Point(2, 3);
        arr[1] = new Circle(2, 3, 4);
        arr[2] = new Cylinder(2, 3, 4, 5);
        for (int i = 0; i < arr.length; i++) {
            String name = arr[i].getName();
            double area = arr[i].calArea();
            double vol = arr[i].calVolume();
            System.out.println("Object: " + name +
                    " - Area: " + area +
                    " - Volume: " + vol);
        }
    }
}
