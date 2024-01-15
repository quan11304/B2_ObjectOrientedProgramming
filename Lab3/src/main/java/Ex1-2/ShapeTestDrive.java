public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Point();
        arr[1] =new Circle();
        arr[2] = new Cylinder();
        for (int i = 0;i<arr.length;i++) {
            String name = arr[i].getName();
            double area = arr[i].calArea();
            double vol = arr[i].calVolume();
            System.out.println("Object: " + name +
                    " - Area: " + area +
                    " - Volume: " + vol);
        }
    }
}
